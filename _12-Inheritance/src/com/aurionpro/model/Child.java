package com.aurionpro.test;

import com.aurionpro.model.Parent;

public class Child  extends Parent{
    public void childGreet(){
        System.out.println("Welcome from child");
        System.out.println("Print message from parent :"+ message);
    }
}
