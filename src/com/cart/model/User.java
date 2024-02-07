package com.cart.model;

public class User extends Employee {

    private int userId;
    private String userName;
    private String password;
    private String userType;
    private int empNo;
    private int securityQuestionId;
    private String answer;
    private int loginCount;

    public int getSecurityQuestionId() {
        return securityQuestionId;
    }

    public void setSecurityQuestionId(int securityQuestionId) {
        this.securityQuestionId = securityQuestionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
        employeeId = empNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User(int userId, String userName, String password, String userType, int employeeId) {
        super(employeeId);
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.empNo = employeeId;
        this.loginCount = 0;
    }

    @Override
    public void setEmployeeId(int employeeId) {
        this.empNo = employeeId;
        super.setEmployeeId(employeeId);
    }

}
