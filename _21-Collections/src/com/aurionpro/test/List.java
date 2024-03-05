package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Comparator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        list.add("Hii");
        list.add("I");
        list.add("AM");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf("AM"));
        System.out.println(list.equals("AM"));

    }

}