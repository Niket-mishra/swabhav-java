package com.aurionpro.model;

public class AddDemo {
    public int add(int num1, int num2) {
        System.out.println("Method with two Int");
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        System.out.println("Method with two double");
        return num1 + num2;
    }

    public double add(int num1, double num2, double num3) {
        System.out.println("Method with one Int and two double");

        return num1 + num2 + num3;
    }
}
