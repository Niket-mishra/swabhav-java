package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        System.out.println(hm.isEmpty());
        hm.put("A", 100);
        hm.put("B", 200);
        hm.put("C", 300);
        hm.put("D", 400);
        hm.put("E", 500);
        System.out.println(hm.get("B"));
        System.out.println(hm);
        hm.remove("E");
        System.out.println(hm);
        System.out.println(hm.containsKey("A"));
        System.out.println(hm.containsKey("E"));
        hm.replace("A", 100, 500);
        System.out.println(hm.get("A"));
        System.out.println(hm);
        System.out.println(hm.size());

        System.out.println(hm);
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.print(e.getKey() + " : ");
            System.out.println(e.getValue());
        }
    }
}
// Create a List of n employees(employee id,employee name, salary).
// Create a menu driven
// Program to display Employees in sorted order of id,name and salary using Comparator.
