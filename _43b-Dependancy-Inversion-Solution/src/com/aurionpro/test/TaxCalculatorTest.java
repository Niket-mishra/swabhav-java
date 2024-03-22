package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.FileLogger;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        DBLogger dbLogger = new DBLogger();
        TaxCalculator t1 = new TaxCalculator(dbLogger);
        System.out.println(t1.calculateTax(1000, 10));
        t1.calculateTax(2000, 0);

        FileLogger fileLogger = new FileLogger();

        t1.setLogger(fileLogger);
        System.out.println(t1.calculateTax(1000, 20));
        t1.calculateTax(2000, 0);

    }
}
