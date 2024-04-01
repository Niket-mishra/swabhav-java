package com.aurionpro.model;

import java.time.LocalDate;

public class Bus extends Vehicle implements IMovable{
    public Bus(String brand, LocalDate dom) {
        super(brand, dom);
    }

    @Override
    public void move() {
        System.out.println("Bus is Moving");
    }

    @Override
    public void showTopSpeed() {
        System.out.println("Top Speed of Bus is 150 km/hr");
    }
}
