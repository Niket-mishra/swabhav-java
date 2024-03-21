package com.aurionpro.model;

public class Robot implements IWorker{
    @Override
    public void startWork() {
        System.out.println("Robot is Working");
    }

    @Override
    public void stopWork() {
        System.out.println("Robot Stop Working");
    }

    @Override
    public void eat() {
        System.out.println("No Implementation");
    }

    @Override
    public void drink() {
        System.out.println("No Implementation");
    }
}
