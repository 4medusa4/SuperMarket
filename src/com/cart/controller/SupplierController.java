package com.cart.controller;

import com.cart.assest.model.Table;
import com.cart.model.Database;
import com.cart.model.Supplier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SupplierController {

    private final Supplier supplier;

    public SupplierController(Supplier supplier) {
        this.supplier = supplier;
    }

    public boolean saveSupplier() {
        boolean i = false;
        String sql = "INSERT INTO tbl_supplier (supId, supName, supTP, supEmail, supLocation) VALUES (?, ?, ?, ?, ?)";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, supplier.getSupplierId());
            pst.setString(2, supplier.getSupplierName());
            pst.setString(3, supplier.getSupplierTP());
            pst.setString(4, supplier.getSupplierEmail());
            pst.setString(5, supplier.getSupplierLocation());
            int results = pst.executeUpdate();
            i = results > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }
    
    public boolean deleteSupplier() {
        boolean i = false;
        String sql = "UPDATE tbl_supplier SET supDeleted = 1 WHERE supId = ?";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, supplier.getSupplierId());

            int results = pst.executeUpdate();
            if (results > 0) {
                i = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return i;
    }
    
    

    public static void loadSupplierName(JComponent obj) {
        if (obj instanceof JComboBox cmb) {

            try ( Statement stmt = Database.getConnection().createStatement()) {
                String sql = "SELECT supId, supName FROM tbl_supplier";
                ResultSet result = stmt.executeQuery(sql);
                cmb.removeAllItems();
                cmb.addItem("Select Supplier Name");
                while (result.next()) {
                    cmb.addItem(result.getString(2) + " -" + result.getInt(1));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    private static ResultSet getSupplierDetails(String txt) throws SQLException {
        Statement stmt = Database.getConnection().createStatement();
        String sql = "";
        if (txt.isEmpty()) {
            sql = "SELECT supId, supName, supTP, supEmail, supLocation FROM tbl_supplier WHERE supDeleted = 0";
        } else {
            sql = "SELECT supId, supName, supTP, supEmail, supLocation FROM tbl_supplier "
                    + "WHERE (supId LIKE '%" + txt + "%' "
                    + "or supName LIKE '%" + txt + "%' "
                    + "or supTP LIKE '%" + txt + "%' "
                    + "or supEmail LIKE '%" + txt + "%' "
                    + "or supLocation LIKE '%" + txt + "%') "
                    + "AND supDeleted = 0";
        }
        return stmt.executeQuery(sql);
    }

    public static void getSupplpier(Table table, String txt) {
        table.setHas_status(false);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);

        try ( ResultSet r = SupplierController.getSupplierDetails(txt)) {
            if (r.next()) {
                do {
                    dt.addRow(new Object[]{r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5)});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Supplier getLastSupplier() {
        Supplier s = new Supplier();
        try ( Statement stmt = Database.getConnection().createStatement()) {
            String sql = "SELECT supId FROM tbl_supplier WHERE supId = (SELECT MAX(supId) FROM tbl_supplier)";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                s.setSupplierId(result.getInt(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return s;
    }

    public static Supplier getSupplier(int supplierId) {
        Supplier s = null;
        String sql = "SELECT supId, supName, supTP, supEmail, supLocation, supDeleted FROM tbl_supplier WHERE supId = ?";
        try(PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, supplierId);
            ResultSet r = pst.executeQuery();
            s = new Supplier();
            while (r.next()) {                
                s.setSupplierId(r.getInt(1));
                s.setSupplierName(r.getString(2));
                s.setSupplierTP(r.getString(3));
                s.setSupplierEmail(r.getString(4));
                s.setSupplierLocation(r.getString(5));
            }
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return s;
    }

}