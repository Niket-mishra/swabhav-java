package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle implements IMovable {
    public Car(String brand, LocalDate dom) {
        super(brand, dom);
    }

    @Override
    public void showTopSpeed() {
        System.out.println("Top Speed of Car is 200 km/hr");
    }

    @Override
    public void move() {
        System.out.println("Car is Moving");
    }
}
