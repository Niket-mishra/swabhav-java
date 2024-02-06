package com.aurionpro.model;

import static java.lang.Math.*;

public class Circle {
    private double radius;
    private BorderType borderType;
    private Color color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public BorderType getBorderType() {
        return borderType;
    }

    public void setBorderType(BorderType borderType) {
        this.borderType = borderType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public double calculateArea() {
        double v= (this.radius * (PI*PI));
        return v;
    }

    public Circle(int radius, BorderType borderType, Color color) {
        this.radius = radius;
        this.borderType = borderType;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.borderType=BorderType.SOLID;
        this.color=Color.RED;
    }

    public Circle() {
    }
}
