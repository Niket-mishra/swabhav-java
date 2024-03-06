package com.aurionpro.java;

import java.util.Comparator;

public class SalaryCompare implements Comparator<Model> {
    @Override
    public int compare(Model o1, Model o2) {
        return (int) (o1.getSalary()- o2.getSalary());
    }
}
