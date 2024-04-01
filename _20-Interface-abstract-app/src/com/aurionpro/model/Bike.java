package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMovable{
    public Bike(String brand, LocalDate dom) {
        super(brand, dom);
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }

    @Override
    public void showTopSpeed() {
        System.out.println("Top Speed of Bike is 300 km/hr");
    }
}
