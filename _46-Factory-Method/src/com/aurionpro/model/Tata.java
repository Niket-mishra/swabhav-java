package com.aurionpro.model;

public class Tata implements ICars{
    @Override
    public void start() {
        System.out.println("Tata Started");
    }

    @Override
    public void stop() {
        System.out.println("Tata Stopped");
    }
}
