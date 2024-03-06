package com.aurionpro.java;

import java.util.Comparator;

public class NameCompare implements Comparator<Model> {
    @Override
    public int compare(Model o1, Model o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
