package com.cart.model;

public class SecurityQuestion {

    private int questionId;
    private String qustion;

    public SecurityQuestion(int questionId, String qustion) {
        this.questionId = questionId;
        this.qustion = qustion;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQustion() {
        return qustion;
    }

    public void setQustion(String qustion) {
        this.qustion = qustion;
    }

}
