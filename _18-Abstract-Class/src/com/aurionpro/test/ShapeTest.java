package com.aurionpro.test;

import com.aurionpro.model.Circle;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red",20);

        System.out.println(c1.CalculateArea());
    }
}
