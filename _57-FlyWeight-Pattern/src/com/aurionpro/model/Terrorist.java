package com.aurionpro.model;

public class Terrorist implements IPlayer{
    private final String TASK;
    private String weapon;

    public Terrorist() {
        TASK="PLANT A BOMB";
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
        System.out.println("Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}
