package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class IntegerTest
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70);
       Integer min  = numbers.stream().min(Integer::compare).get();
        System.out.println(min);
        Integer i = numbers.stream().max(Integer::compare).get();
        System.out.println(i);
    }


}
