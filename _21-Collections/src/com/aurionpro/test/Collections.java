package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(10);
        System.out.println(list.contains(10));
        System.out.println(list);
        list.add(20);
        System.out.println(list);
        list.add(0,40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        ArrayList list1 = new ArrayList<>();
        list1.add(list);
        list1.add(list);
        list1.add(0,30);
        System.out.println(list1);

        List list2 = new ArrayList<>();
        list2.addAll(list);
        list2.addAll(list);
        System.out.println(list2);

        Object list3 = list.clone();
        System.out.println(list3);
        System.out.println(list.isEmpty());
        list.removeAll(list1);
        System.out.println(list.isEmpty());
        list3.toString();
        System.out.println( list3);

    }
}
