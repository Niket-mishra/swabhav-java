package com.aurionpro.model;


import java.util.logging.Logger;

public class RealImage implements IImage{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading Image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Dsiplaying Image: " + filename);
    }
}
