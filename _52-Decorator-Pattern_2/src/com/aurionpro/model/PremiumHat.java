package com.aurionpro.model;

public class PremiumHat implements IHat{
    @Override
    public String getName() {
        return "Premium Hat";
    }

    @Override
    public String getDescription() {
        return "Premium Quality in Best Price";
    }

    @Override
    public double getPrice() {
        return 5000;
    }
}
