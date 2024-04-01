package com.aurionpro.model;

public class GoldenHat extends HatDecorator{
    public GoldenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return "Golden "+ super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Gold.";
    }

    @Override
    public double getPrice() {
        return super.getPrice()  + 4000;
    }

    @Override
    public String toString() {
        return "GoldenHat{}";
    }

}
