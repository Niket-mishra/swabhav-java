package com.aurionpro.test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest{
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Niket", "Ajay", "Sam", "Azad", "Ram", "Tara");
        System.out.println(nameList);
//        List<String> filteredList = new ArrayList<>();
//        for (String x : nameList) {
//            if (x.length() <= 4) {
//                filteredList.add(x.toUpperCase());
//            }
//        }
//        System.out.println(filteredList);
//        List<String> newList = new ArrayList<>();
//
//        Collections.sort(filteredList);
//        System.out.println(filteredList);
//
//

        List<String> collect = nameList.stream().sorted(Comparator.reverseOrder()).filter(x -> x.length() < 4).limit(4).map(x -> x.toUpperCase()).collect(Collectors.toList());

        System.out.println(collect);
    }

    }



