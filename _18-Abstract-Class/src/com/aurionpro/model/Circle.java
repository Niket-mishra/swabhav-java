package com.aurionpro.model;


public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double CalculateArea() {
        return Math.PI * radius * radius;
    }

}
