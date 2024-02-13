package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 =new Student(1,"Niket","niketmishraofficial@Gmail.com");

        Student.setUniversity("Mumbai University");
        Student s2 = new Student();
        s2.setName("Niket");
        s2.setRollNumber(2);
        s2.setEmail("mefkdmcke@gmail.com");
        System.out.println(s1);
        System.out.println(s2);
    }
}
