package com.aurionpro.model;

public class Billing {
    public  double calculateTax(Invoice e){ return e.getAmount()*e.getTax()/100; }
    public  double calculateDiscount(Invoice e){
        return e.getDiscountPercent()*e.getAmount();
    }
    public double calculateTotal(Invoice e){
        return e.getAmount()+calculateTax(e)-calculateDiscount(e);
    }
}
