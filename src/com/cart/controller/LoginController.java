package com.cart.controller;

import com.cart.model.Database;
import com.cart.model.Login;
import com.cart.model.SecurityQuestion;
import com.cart.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginController {

    private final Login login;

    public LoginController(Login login) {
        this.login = login;
    }

    public Login getLogin() {
        return login;
    }

    public static User login(JTextField txt_username, JPasswordField txt_password) throws InputMismatchException {
        String username = txt_username.getText();
        String password = new String(txt_password.getPassword());
        String sql1 = "SELECT userId, userName, userType, password, empNo, loginCount FROM tbl_user WHERE (username = ? AND password = ?) AND userDeleted = 0";
        String sql2 = "UPDATE tbl_user SET loginCount = ? WHERE userId = ?";
        User u = null;
        try (final PreparedStatement pst1 = Database.getConnection().prepareStatement(sql1); final PreparedStatement pst2 = Database.getConnection().prepareStatement(sql2)) {
            pst1.setString(1, username);
            pst1.setString(2, password);
            ResultSet r = pst1.executeQuery();
            while (r.next()) {
                u = new User(r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getInt(5));
                u.setLoginCount(r.getInt(6));
            }
            if (u == null) {
                throw new InputMismatchException("User not found");
            } else {
                int loginCount = u.getLoginCount();
                u.setLoginCount(++loginCount);
                pst2.setInt(1, u.getLoginCount());
                pst2.setInt(2, u.getUserId());
                pst2.executeUpdate();
            }
            pst2.close();
            pst1.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return u;
    }

    public static List<SecurityQuestion> getQuestions() {
        List<SecurityQuestion> listOfQuestions = new ArrayList<>();

        String sql = "SELECT securityQuestionId, securityQuestion FROM tbl_securityquestion";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            ResultSet r = pst.executeQuery();
            while (r.next()) {
                SecurityQuestion sq = new SecurityQuestion(r.getInt(1), r.getString(2));
                listOfQuestions.add(sq);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listOfQuestions;
    }
    
    public static boolean saveSecurityQuestion(User user) {
        boolean flag = false;
        String sql = "UPDATE tbl_user SET securityQuestionNo = ? , answer = ? WHERE userId = ?";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, user.getSecurityQuestionId());
            pst.setString(2, user.getAnswer());
            pst.setInt(3, user.getUserId());
            if (pst.executeUpdate() > 0) {
                flag = true;
            }
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return flag;
    }

}
