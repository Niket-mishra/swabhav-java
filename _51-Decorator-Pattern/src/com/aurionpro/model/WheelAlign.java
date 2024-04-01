package com.aurionpro.model;

public class WheelAlign extends CarServiceDecorator {
    public WheelAlign(ICarServices carObj) {
        super(carObj);
    }

    @Override
    public double getCost() {
        return 400 + super.getCost();
    }
}
