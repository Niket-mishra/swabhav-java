package com.aurionpro.model;

public class Child  {
    public void childGreet(){
        System.out.println("Welcome from child");
        System.out.println("Print message from parent :"+ new Parent().message);
    }
}
