package com.aurionpro.model;

public class TaxCalculator {
    DBLogger dbLogger;

    public TaxCalculator(DBLogger dbLogger) {
        this.dbLogger = dbLogger;
    }
    public int calculateTax(int amount,int rate){
        int tax =0;
        try {
            tax =amount/rate;

        } catch (Exception e) {
            new DBLogger().log("Divide by Zero");
        }
        return tax;
    }
}
