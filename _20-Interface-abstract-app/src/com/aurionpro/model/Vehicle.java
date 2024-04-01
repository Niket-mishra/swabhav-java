package com.aurionpro.model;

import java.time.LocalDate;

public abstract class Vehicle {
    private String brand;
    private LocalDate dom;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDom() {
        return dom;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }

    public Vehicle(String brand, LocalDate dom) {
        this.brand = brand;
        this.dom = dom;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", dom=" + dom +
                '}';
    }

    public abstract void showTopSpeed();
}
