package com.aurionpro.model;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double CalculateArea();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                "calculate Area ="+CalculateArea()+
                '}';
    }
}
