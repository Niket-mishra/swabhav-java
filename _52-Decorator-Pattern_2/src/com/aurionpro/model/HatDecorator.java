package com.aurionpro.model;

public abstract class HatDecorator implements IHat{
    private IHat hat;

    public HatDecorator(IHat hat) {
        this.hat = hat;
    }

    @Override
    public String getName() {
        return hat.getName();
    }

    @Override
    public String getDescription() {
        return hat.getDescription();
    }

    @Override
    public double getPrice() {
        return hat.getPrice();
    }

    @Override
    public String toString() {
        return "HatDecorator{" +
                "hat=" + hat +
                '}';
    }
}
