package com.aurionpro.model;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }
    public static Singleton getInstance(){
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;
    }

    protected Object readResolve() { return singleton; }
}
