package com.aurionpro.test;

import com.aurionpro.model.Student;

public class Mani {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
