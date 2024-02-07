package com.cart.controller;

import com.cart.assest.model.Table;
import com.cart.model.Database;
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

public class UserController {

    private final User user;

    public User getUser() {
        return user;
    }

    public UserController(User user) {
        this.user = user;
    }

    public boolean saveUser() {
        boolean i = false;
        String sql = "INSERT INTO tbl_user (userId, userName, userType, password, empNo) values (?, ?, ?, ?, ?)";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, user.getUserId());
            pst.setString(2, user.getUserName());
            pst.setString(3, user.getUserType());
            pst.setString(4, user.getPassword());
            pst.setInt(5, user.getEmpNo());
            int results = pst.executeUpdate();
            i = results > 0;
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return i;
    }
    
    public boolean deleteUser() {
        boolean i = false;
        String sql = "UPDATE tbl_user SET userDeleted = 1 WHERE userId = ?";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, user.getUserId());

            int results = pst.executeUpdate();
            if (results > 0) {
                i = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return i;
    }
    

    public static void loadEmployees(JComponent obj) {
        if (obj instanceof JComboBox cmb) {

            try ( Statement stmt = Database.getConnection().createStatement()) {
                String sql = "select * from tbl_employee as emp where not exists ( select * from tbl_user as usr where emp.empId = usr.empNo)";
                ResultSet result = stmt.executeQuery(sql);
                cmb.removeAllItems();
                cmb.addItem("Select Employee Id");
                while (result.next()) {
                    cmb.addItem(result.getInt(1) + "");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    //search user data
    private static ResultSet getUserDetails(String txt) throws SQLException {
        Statement stmt = Database.getConnection().createStatement();
        String sql = "";
        if (txt.isEmpty()) {
            sql = "SELECT userId, userName, userType, empNo FROM tbl_user WHERE userDeleted = 0";
        } else {
            sql = "SELECT userId, userName, userType, empNo FROM tbl_user "
                    + "WHERE (userId LIKE '%" + txt + "%' "
                    + "or userName LIKE '%" + txt + "%' "
                    + "or userType LIKE '%" + txt + "%' "
                    + "or empNo LIKE '%" + txt + "%') "
                    + "AND userDeleted = 0";
        }
        return stmt.executeQuery(sql);
    }

    //view user data in a table
    public static void getUser(Table table, String txt) {
        table.setHas_status(false);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);

        try ( ResultSet r = UserController.getUserDetails(txt)) {
            if (r.next()) {
                do {
                    dt.addRow(new Object[]{r.getInt(1), r.getString(2), r.getString(3), r.getInt(4)});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    public static User getLastUser() {
        User u = null;
        try ( Statement stmt = Database.getConnection().createStatement()) {
            String sql = "SELECT userId, userName, userType, password, empNo FROM tbl_user WHERE userId = (SELECT MAX(userId) FROM tbl_user)";
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                u = new User(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getInt(5));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return u;
    }

}
