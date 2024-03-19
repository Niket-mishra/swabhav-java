package com.aurionpro.model;

import com.sun.jdi.Method;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Anno {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Important
    public double getSalary() {
        return salary;
    }
@Important
    public void setSalary(double salary) {
        this.salary = salary;
    }
    private static final int aa = 200;

    @Override
    public String toString() {
        return "Anno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

    }
}
