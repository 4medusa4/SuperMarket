package com.cart.model;

import java.util.Date;

public class Employee {

    protected int employeeId;
    protected String employeeName;
    protected String employeeEmail;
    protected Date employeeDOB;
    protected String employeePosion;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Date getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(Date employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public String getEmployeePosion() {
        return employeePosion;
    }

    public void setEmployeePosion(String employeePosion) {
        this.employeePosion = employeePosion;
    }

}
