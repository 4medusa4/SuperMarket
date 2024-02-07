package com.cart.model;

public class Report {

    public Report() {
    }

    public Report(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    private String query;
}
