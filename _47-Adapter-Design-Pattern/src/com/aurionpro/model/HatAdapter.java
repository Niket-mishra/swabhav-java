package com.aurionpro.model;

public class HatAdapter implements IItems{
    private Hat hat;

    public HatAdapter(Hat hat) {
        this.hat = hat;
    }

    @Override
    public String getItemName() {
        return hat.getLongName()+hat.getShortName();
    }

    @Override
    public double getItemPrice() {
        return hat.getBasicPrice()+hat.getTax();
    }

    @Override
    public String toString() {
        return "HatAdapter{" +
                "hat=" + hat +
                '}';
    }
}
