package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rohit");
        map.put(2, "Hardik");
        map.put(3, "Virat");
        map.put(4, "Ashwin");
        map.put(5, "Dhoni");
        map.put(6, "Kapil");
        int n = 0;
        System.out.println(map);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value to remove : ");
        String value = sc.next();
        if (map.containsValue(value)) {
            for (Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(value)) {
                    n = entry.getKey();


                }
            }

        }else {
            System.out.println(" Value not Found !!!!!!!");
        }
        map.remove(n);
        System.out.println(map);
    }
}
