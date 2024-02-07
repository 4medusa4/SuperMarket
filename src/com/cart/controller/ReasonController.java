package com.cart.controller;

import com.cart.model.Database;
import com.cart.model.Reason;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ReasonController {

    private Reason reason;

    public ReasonController(Reason reason) {
        this.reason = reason;
    }

    public static List<Reason> getReturnReasons() {
        List<Reason> listOfreason = new ArrayList<>();
        String sql = "SELECT reasonId, reason FROM tbl_return_reason";
        try ( Statement stmt = Database.getConnection().createStatement()) {
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                Reason reason = new Reason();
                reason.setReasonId(resultSet.getInt(1));
                reason.setReason(resultSet.getString(2));
                listOfreason.add(reason);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error in db", JOptionPane.ERROR_MESSAGE);
        }
        return listOfreason;
    }
}