package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.FileLogger;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        DBLogger dbLogger = new DBLogger();
        TaxCalculator t1 = new TaxCalculator(dbLogger);
        int i = t1.calculateTax(1000, 10);
        System.out.println(i);

        TaxCalculator t2 = new TaxCalculator(dbLogger);
        t2.calculateTax(2000,0);
        FileLogger f1 = new FileLogger();
        TaxCalculator t3 = new TaxCalculator(f1);
    }
}
