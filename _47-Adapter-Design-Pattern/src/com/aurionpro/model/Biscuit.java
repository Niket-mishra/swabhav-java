package com.aurionpro.model;

public class Biscuit implements IItems
{
    private String name;
    private double mrp;
    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public double getItemPrice() {
        return mrp;
    }

    public Biscuit(String name, double mrp) {
        this.name = name;
        this.mrp = mrp;
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "name='" + name + '\'' +
                ", mrp=" + mrp +
                '}';
    }
}
