package com.aurionpro.model;

public class CounterTerrorist implements IPlayer{
    private final String TASK;
    private String weapon;

    public CounterTerrorist() {
        TASK = "DIFFUSE BOMB";
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}
