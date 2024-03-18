package com.aurionpro.test;

import java.util.Arrays;

public class TaskMainTest {
    public static void main(String[] args) {
        String[] names = {"Jayesh","Nimesh","Mahesh","Ramesh"};
        for(String x : names){
            System.out.println(x);
        }

        Arrays.stream(names).forEach(s -> System.out.println("NAmes Stream :"+s));
        Arrays.asList(names).forEach(s -> {
            System.out.println("List :"+s);
        });

    }
}
