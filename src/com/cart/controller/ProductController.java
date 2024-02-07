package com.cart.controller;

import com.cart.assest.model.Table;
import com.cart.model.Database;
import com.cart.model.Product;
import com.cart.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.InputMismatchException;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ProductController {

    private final Product product;

    public Product getProduct() {
        return product;
    }

    public ProductController(Product product) {
        this.product = product;
    }

    public boolean saveProduct() {
        boolean i = false;
        String sql = "INSERT INTO tbl_product (proId, proName, proType, proQuantity, proPrice, proExDate, proDescription) values (?, ?, ?, ?, ?, ?, ?)";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, product.getProductId());
            pst.setString(2, product.getProductName());
            pst.setString(3, product.getProductType());
            pst.setInt(4, 0);
            pst.setDouble(5, 0.00);
            pst.setDate(6, java.sql.Date.valueOf(LocalDate.now()));
            pst.setString(7, product.getProDescription());
            int results = pst.executeUpdate();
            i = results > 0;
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return i;
    }

    public boolean updateProduct() {
        boolean i = false;
        String sql = "UPDATE tbl_product SET proName = ?, proType = ?, disRate = ?, proDescription = ? WHERE proId = ?";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setString(1, product.getProductName());
            pst.setString(2, product.getProductType());
            pst.setDouble(3, product.getDiscountRate());
            pst.setString(4, product.getProDescription());
            pst.setInt(5, product.getProductId());

            int results = pst.executeUpdate();
            if (results > 0) {
                i = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return i;
    }

    public boolean deleteProduct() {
        boolean i = false;
        String sql = "UPDATE tbl_product SET proDeleted = 1 WHERE proId = ?";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, product.getProductId());

            int results = pst.executeUpdate();
            if (results > 0) {
                i = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return i;
    }

    private static ResultSet getProductDetails(String txt) throws SQLException {
        Statement stmt = Database.getConnection().createStatement();
        String sql = "";
        if (txt.isEmpty()) {
            sql = "SELECT proId, proName, proType, proDescription FROM tbl_product WHERE proDeleted = 0";
        } else {
            sql = "SELECT proId, proName, proType, proDescription FROM tbl_product "
                    + "WHERE (proId LIKE '%" + txt + "%' "
                    + "or proName LIKE '%" + txt + "%' "
                    + "or proType LIKE '%" + txt + "%' "
                    + "or proDescription LIKE '%" + txt + "%') "
                    + "AND proDeleted = 0";
        }
        return stmt.executeQuery(sql);
    }

    public static void getProduct(Table table, String txt) {
        table.setHas_status(false);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);

        try ( ResultSet r = ProductController.getProductDetails(txt)) {
            if (r.next()) {
                do {
                    dt.addRow(new Object[]{r.getInt(1), r.getString(2), r.getString(3), r.getString(4)});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void loadProduct(JComponent obj) {
        if (obj instanceof JComboBox cmb) {

            try ( Statement stmt = Database.getConnection().createStatement()) {
                String sql = "SELECT proId FROM tbl_product";
                ResultSet result = stmt.executeQuery(sql);
                cmb.removeAllItems();
                cmb.addItem("Select Product Id");
                while (result.next()) {
                    cmb.addItem(result.getInt(1) + "");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    public static Product getProduct(int proId) {
        Product p = null;
        String sql = "SELECT proId, proName, proType, proQuantity, proPrice, proExDate, disRate, proDescription, proDeleted FROM tbl_product WHERE proId = ?";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, proId);
            ResultSet result = pst.executeQuery();
            p = new Product();
            while (result.next()) {
                p.setProductId(result.getInt(1));
                p.setProductName(result.getString(2));
                p.setProductType(result.getString(3));
                p.setProductQuantity(result.getInt(4));
                p.setProductPrice(result.getDouble(5));
                p.setProductExDate(result.getDate(6));
                p.setDiscountRate(result.getDouble(7));
                p.setProDescription(result.getString(8));
            }
            
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return p;
    }

}
