package com.aurionpro.model;

public class Total {
    public double calculateTotal(Invoice e){
        return e.getAmount()-(e.getAmount()*e.getTax()/100)+(e.getDiscountPercent()*e.getAmount());
    }
}
