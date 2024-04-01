package com.aurionpro.model;

import java.util.*;

public class KeyCount {
    public static void main(String[] args) {
        Integer[] integers = {10,10,10,20,20,30,40,40,40,40};
        List<Integer> list = List.of(integers);
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer x : list){
            if (map.containsKey(x)) {
                Integer i = map.get(x);
                map.put(x,++i);
            }
            else{
                map.put(x,1);
            }
        }

        for (Map.Entry x : map.entrySet()) System.out.println(x);



    }
}
