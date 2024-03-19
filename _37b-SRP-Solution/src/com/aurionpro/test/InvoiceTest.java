package com.aurionpro.test;

import com.aurionpro.model.Billing;
import com.aurionpro.model.Invoice;
import com.aurionpro.model.Total;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Puma","leather Jacket",1500,25.00f,0.25);
        Billing billing = new Billing();
        Total total = new Total();
        double v1 = total.calculateTotal(invoice);
        System.out.println(v1);
        double v2 = billing.calculateDiscount(invoice);
        System.out.println(v2);
        double v = billing.calculateTax(invoice);
        System.out.println(v);
    }

}
