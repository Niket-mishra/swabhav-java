package com.aurionpro.model;

public class StandardHat implements IHat{
    @Override
    public String getName() {
        return "Standard Hat";
    }

    @Override
    public String getDescription() {
        return "Low Budget Good Quality";
    }

    @Override
    public double getPrice() {
        return 1000;
    }

}
