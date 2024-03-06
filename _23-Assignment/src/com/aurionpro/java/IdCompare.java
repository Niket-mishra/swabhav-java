package com.aurionpro.java;

import java.util.Comparator;

public class IdCompare implements Comparator<Model> {
    @Override
    public int compare(Model o1, Model o2) {
        return o1.getId()- o2.getId();
    }
}
