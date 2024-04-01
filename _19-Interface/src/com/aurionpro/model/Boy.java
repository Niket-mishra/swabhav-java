package com.aurionpro.model;

public class Boy implements IMannerable {
    @Override
    public void welcomeGreet() {
        System.out.println("Boy Welcomes");
    }

    @Override
    public void departGreet() {
        System.out.println("Boy Departs Greet");
    }
}
