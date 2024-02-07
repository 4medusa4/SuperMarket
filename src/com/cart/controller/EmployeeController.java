
package com.cart.controller;

import com.cart.model.Database;
import com.cart.model.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

public class EmployeeController {
    
    public static Employee getEmployee(int empId) {
        Employee e = null;
        String sql = "SELECT empId, empName, empEmail, empDOB, empPosition FROM tbl_employee WHERE empId = ?";
        try ( PreparedStatement pst = Database.getConnection().prepareStatement(sql)) {
            pst.setInt(1, empId);
            ResultSet result = pst.executeQuery();
            e = new Employee(empId);
            while (result.next()) {
                e.setEmployeeId(result.getInt(1));
                e.setEmployeeName(result.getString(2));
                e.setEmployeeEmail(result.getString(3));
                e.setEmployeeDOB(result.getDate(4));
                e.setEmployeePosion(result.getString(5));
            }
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return e;
    }
    
}
