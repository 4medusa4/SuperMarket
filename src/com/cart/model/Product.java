package com.cart.model;

import java.util.Date;

public class Product {

    private int productId;
    private String productName;
    private String productType;
    private int productQuantity;
    private double productPrice;
    private Date productExDate;
    private double discountRate;
    private double discountAmount;
    private boolean proDeleted;

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
    private String proDescription;

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }



    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Date getProductExDate() {
        return productExDate;
    }

    public void setProductExDate(Date productExDate) {
        this.productExDate = productExDate;
    }

    public boolean isProDeleted() {
        return proDeleted;
    }

    public void setProDeleted(boolean proDeleted) {
        this.proDeleted = proDeleted;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

}
