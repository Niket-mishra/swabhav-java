package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("ANANA");
        hashSet.add("AN");
        hashSet.add("NA");
        hashSet.add("ANNA");
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
        hashSet.add("Ni");
        System.out.println(hashSet.contains("Ni"));
        System.out.println(hashSet.contains("wsjwsj"));
        hashSet.add("Nik");
        hashSet.add("Nk");
        hashSet.add("ik");
        hashSet.add("Nike");
        hashSet.add("A");
        System.out.println(hashSet);
        System.out.println(hashSet.hashCode());



    }

}
