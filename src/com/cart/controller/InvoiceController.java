package com.cart.controller;

import com.cart.model.Database;
import com.cart.model.Invoice;
import com.cart.model.Product;
import com.cart.model.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class InvoiceController {

    private final Invoice invoice;

    public InvoiceController(Invoice invoice) {
        this.invoice = invoice;
    }

    public boolean saveInvoice() {
        boolean flag = true;
        String sql1 = "INSERT INTO tbl_invoice (invId, invDate, invTime, invTotal, userNo) VALUES (?, ?, ?, ?, ?)";
        String sql2 = "INSERT INTO tbl_invoice_product (invNo, proNo, quantity) VALUES (?, ?, ?)";
        try ( Connection con = Database.getConnection()) {
            PreparedStatement pst_insertInvoice = con.prepareStatement(sql1);
            con.setAutoCommit(false);
            pst_insertInvoice.setInt(1, invoice.getInvoiceId());
            pst_insertInvoice.setDate(2, (Date) invoice.getInvoiceDate());
            pst_insertInvoice.setTimestamp(3, invoice.getInvoiceTime());
            pst_insertInvoice.setDouble(4, invoice.getInvoiceTotal());
            pst_insertInvoice.setInt(5, invoice.getUserNo());
            int results = pst_insertInvoice.executeUpdate();
            if (flag && results > 0) {
                pst_insertInvoice.close();
                try ( PreparedStatement pst_inserProduct = con.prepareStatement(sql2)) {
                    List<Product> pList = invoice.getProducts();
                    int iId = invoice.getInvoiceId();
                    for (int j = 0; j < pList.size(); j++) {
                        Product p = pList.get(j);
                        pst_inserProduct.setInt(1, iId);
                        pst_inserProduct.setInt(2, p.getProductId());
                        pst_inserProduct.setInt(3, p.getProductQuantity());
                        results = pst_inserProduct.executeUpdate();
                        if (!flag) {
                            con.rollback();
                            break;
                        }
                    }
                }
            }
            con.commit();
            con.close();
        } catch (SQLException e) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Type: " + e.getSQLState() + "\n Message: " + e.getMessage());
        }
        return flag;
    }
    
    public static Invoice getLastInvoice() {
        Invoice i = new Invoice();
        try ( Statement stmt = Database.getConnection().createStatement()) {
            String sql = "SELECT invId FROM tbl_invoice WHERE invId = (SELECT MAX(invId) FROM tbl_invoice)";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                i.setInvoiceId(result.getInt(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }

}
