package com.aurionpro.model;

import java.util.PropertyResourceBundle;

public class Builder {
private int id;
private String name;
private int rollNo;

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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    private Builder() {
    }
    public static Builder getInstance(){
        return new Builder();
    }
    public Student build()
    {
        return new Student(this);
    }
}
