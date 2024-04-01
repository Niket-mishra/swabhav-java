package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentNewMap {
    Map map = new HashMap<>();
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
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Value to remove : ");
//        String value = sc.next();
        Set<Integer> keyset = map.keySet();
        for (int x : keyset) {
            System.out.print(x);
            System.out.println(" : " + map.get(x));
        }

        map.forEach((key,value)->{
            System.out.print("Key :"+key);
            System.out.println(" Value : "+ value);
        });



        }
    }
