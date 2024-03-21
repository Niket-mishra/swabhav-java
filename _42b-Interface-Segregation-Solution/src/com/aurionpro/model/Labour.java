package com.aurionpro.model;

public class Labour implements IWork,IRest{
    @Override
    public void eat() {
        System.out.println("Labour is Eating");
    }

    @Override
    public void drink() {
        System.out.println("Labour is Drinking");
    }

    @Override
    public void startWork() {
        System.out.println("Labour is Working");
    }

    @Override
    public void stopWork() {
        System.out.println("Labour is Resting");
    }
}
