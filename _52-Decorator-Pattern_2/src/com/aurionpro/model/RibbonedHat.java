package com.aurionpro.model;

public class RibbonedHat extends HatDecorator{
    public RibbonedHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return "Ribboned "+super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Ribbon";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2000;
    }

}
