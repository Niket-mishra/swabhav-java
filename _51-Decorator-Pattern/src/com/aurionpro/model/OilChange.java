package com.aurionpro.model;

public class OilChange extends CarServiceDecorator {
    public OilChange(ICarServices carObj) {
        super(carObj);
    }

    @Override
    public double getCost() {
        return 500 + super.getCost();
    }
}
