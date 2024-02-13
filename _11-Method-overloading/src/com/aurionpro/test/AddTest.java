package com.aurionpro.test;

import com.aurionpro.model.AddDemo;

public class AddTest {

    public static void main(String[] args) {
        AddDemo obj = new AddDemo();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10.5, 11.5));
        System.out.println(obj.add(10, 20.5, 30.05));

    }
}
