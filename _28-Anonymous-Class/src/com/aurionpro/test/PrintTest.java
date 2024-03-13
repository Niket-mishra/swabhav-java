package com.aurionpro.test;

import com.aurionpro.model.InkJet;
import com.aurionpro.model.Iprint;
import com.aurionpro.model.Laser;

public class PrintTest {
    public static void main(String[] args) {
        InkJet obj1 = new InkJet();
        obj1.print();
        Laser obj2 = new Laser();
        obj2.print();
        Iprint obj3 = () -> System.out.println("Printed Directly");

        obj3.print();
    }
}
