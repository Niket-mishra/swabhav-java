package com.aurionpro.test;

import com.aurionpro.model.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Puma", "Clothes", 1200, 15.00f, 0.20);
        System.out.println(invoice1.calculateTax());
        System.out.println(invoice1.calculateDiscount());
        System.out.println(invoice1.calculateTotal());
    }
}
