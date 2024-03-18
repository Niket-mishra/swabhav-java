package com.aurionpro.test;

import com.aurionpro.model.IAddition;

public class AddTest {
    public static void main(String[] args) {
        IAddition addition = (a, b) -> a + b;
        System.out.println(addition.add(1, 2));
        IAddition addition1 = new IAddition() {
            @Override
            public double add(double a, double b) {
                return a + b;
            }
        };
        System.out.println(addition1.add(2,4));
        IAddition addition2 = AddTest::add;
        addition2.add(1.0,2.0);
        IAddition addition3 = Double::sum;
        addition3.add(2.0,3);
    }

    private static double add(double v, double v1) {
        return v+v1;
    }
}
