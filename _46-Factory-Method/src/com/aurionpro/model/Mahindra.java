package com.aurionpro.model;

public class Mahindra implements ICars{
    @Override
    public void start() {
        System.out.println("Mahindra Started");
    }

    @Override
    public void stop() {
        System.out.println("Mahindra Stopped");
    }
}
