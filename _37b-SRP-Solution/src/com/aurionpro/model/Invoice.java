package com.aurionpro.model;

public class Invoice {
    private String id;
    private String description;
    private double amount;
    private float tax;
    private double discountPercent;

    public Invoice(String id, String description, double amount, float tax, double discountPercent) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.tax = tax;
        this.discountPercent = discountPercent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
