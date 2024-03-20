package com.aurionpro.model;

import com.aurionpro.model.IDisplayable;

public class Monitor implements IDisplayable {
    @Override
    public void display() {
        System.out.println("Displaying through monitor");
    }
}
