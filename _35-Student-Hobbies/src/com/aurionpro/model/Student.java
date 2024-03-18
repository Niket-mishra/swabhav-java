package com.aurionpro.model;

import java.util.List;

public class Student {
    private int rollNo;
    private String name;
    private List<String> hobbies;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public Student(int rollNo, String name, List<String> hobbies) {
        this.rollNo = rollNo;
        this.name = name;
        this.hobbies = hobbies;
    }
}
