package com.aurionpro.model;

public  class Student {
    private final int id;
    private final String name;
    private final int rollNo;

    public Student(Builder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.rollNo = builder.getRollNo();
    }
}
