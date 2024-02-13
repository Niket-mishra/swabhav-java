package com.aurionpro.model;

public class ConstructorB extends ConstructorA{
    public ConstructorB() {
        System.out.println("Constructor B");
    }
    static {
        System.out.println("Static Block of B");
    }
}
