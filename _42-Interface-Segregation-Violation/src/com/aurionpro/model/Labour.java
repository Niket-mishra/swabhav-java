package com.aurionpro.model;

public class Labour implements IWorker{
    @Override
    public void startWork() {
        System.out.println("Labour is Working");
    }

    @Override
    public void stopWork() {
        System.out.println("Labour is resting");
    }

    @Override
    public void eat() {
        System.out.println("labour is Eating");
    }

    @Override
    public void drink() {
        System.out.println("Labour is Drinking");
    }
}
