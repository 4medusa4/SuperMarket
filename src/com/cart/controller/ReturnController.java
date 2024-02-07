package com.cart.controller;

import com.cart.model.Database;
import com.cart.model.Return;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ReturnController {

    private final Return rtrn;

    public ReturnController(Return rtrn) {
        this.rtrn = rtrn;
    }

    public boolean save() {
        boolean flag = false;
        String sql = "INSERT INTO tbl_return(returnId, returnDate, quantity, proNo, reason_id, stockNo) VALUES (?, ?, ?, ?, ?, ?)";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, rtrn.getReturnId());
            pst.setDate(2, rtrn.getReturnDate());
            pst.setInt(3, rtrn.getReturnQuantity());
            pst.setInt(4, rtrn.getProductId());
            pst.setInt(5, rtrn.getReasonId());
            pst.setInt(6, rtrn.getStockId());
            int i = pst.executeUpdate();
            if(i > 0) {
                flag = true;
            }
            return flag;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return true;
    }

    public static Return getLastReturn() {
        Return r = new Return();
        try ( Statement stmt = Database.getConnection().createStatement()) {
            String sql = "SELECT returnId, returnDate, quantity, proNo, reason_id, stockNo FROM tbl_return";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                r.setReturnId(result.getInt(1));
                r.setReturnDate(result.getDate(2));
                r.setReturnQuantity(result.getInt(3));
                r.setProductId(result.getInt(4));
                r.setReasonId(result.getInt(5));
                r.setStockId(result.getInt(6));
            }
            if (r.getReturnId() <= 0) {
                r.setReturnId(1000);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }

}