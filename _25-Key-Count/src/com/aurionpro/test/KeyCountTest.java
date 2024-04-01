package com.aurionpro.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyCountTest {
    public static void main(String[] args) {
        String str ="#Developers@Andheri";


        Map<Character,Integer> map = new HashMap<>();

        for(Character x : str.toCharArray()){
            if(Character.isLetter(x)) {
                if (map.containsKey(x)) {
                    Integer i = map.get(x);
                    map.put(x, ++i);
                } else {
                    map.put(x, 1);
                }
            }
        } for (Map.Entry x : map.entrySet()) System.out.println(x);
    }
}
