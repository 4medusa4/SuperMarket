package com.cart.model;

import java.util.Date;
import java.util.List;

public class Stock {

    private int stockId;
    private Date arrivalDate;
    private int supplierNo;
    private List<Product> products;

    public int getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(int supplierNo) {
        this.supplierNo = supplierNo;
    }

    public int getProductCount() {
        return products.size();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

}
