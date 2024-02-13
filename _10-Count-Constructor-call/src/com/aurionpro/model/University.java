package com.aurionpro.model;



public class University {
    private String rollNumber;
    private String name;
    private String email;
    public static int count = 1001;

    public University() {
        this.rollNumber=generateRollNumber();
        count++;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    private static String generateRollNumber() {

        return "Stud"+count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
