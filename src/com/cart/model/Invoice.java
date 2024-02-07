
package com.cart.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Invoice {
    private int invoiceId;
    private Date invoiceDate;
    private Timestamp invoiceTime;
    private double invoiceTotal;
    private int userNo;
    private List<Product> products;
    

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }
    

    public Timestamp getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Timestamp invoiceTime) {
        this.invoiceTime = invoiceTime;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }
    
    
}
