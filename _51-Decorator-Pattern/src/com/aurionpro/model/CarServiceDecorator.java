package com.aurionpro.model;

public abstract class CarServiceDecorator implements ICarServices{
    private ICarServices carObj;

    public CarServiceDecorator(ICarServices carObj) {
        this.carObj = carObj;
    }

    @Override
    public double getCost() {
        return carObj.getCost();
    }
}
