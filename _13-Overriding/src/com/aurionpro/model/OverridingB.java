package com.aurionpro.model;

public class OverridingB extends OverridingA{
    @Override
    public void greet(){
        System.out.println("Hello from B");
    }
}
