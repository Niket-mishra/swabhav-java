package com.aurionpro.model;

public class TaxCalculator {
   ILogger logger;

    public TaxCalculator(ILogger logger) {
        this.logger = logger;
    }

    public ILogger getLogger() {
        return logger;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }
    public int calculateTax(int amount, int rate){
        int tax = 0;
        try{
            tax= amount/rate;
        }
        catch (Exception e){

                    getLogger().log("Divide by Zero");

        }
        return tax;
    }
}
