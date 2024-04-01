package com.aurionpro.model;

public class Man implements IMannerable,IEmotionable{
    @Override
    public void laugh() {
        System.out.println("Man Laughs");
    }

    @Override
    public void cry() {
        System.out.println("Man Cries");
    }

    @Override
    public void welcomeGreet() {
        System.out.println("Man Welcomes");
    }

    @Override
    public void departGreet() {
        System.out.println("Man Depart Greeets");
    }
}
