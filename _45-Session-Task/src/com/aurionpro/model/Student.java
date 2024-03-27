package com.aurionpro.model;

public class Student {

    private static Student student;

    private Student(){
    }

    public static Student getInstance(){
        if(student==null) student = new Student();
        return student;
    }
}
