package com.techlabs.test;
import com.techlabs.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Rohit");
        student1.setLastName("Sharma");
        student1.setEmail("rohit@hitman.com");

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Virat");
        student2.setLastName("Kohli");
        student2.setEmail("virat@king.com");

        Student student3 = new Student(3,"Shubhman","Gill","shubh@gmail.com");
        student3.setFirstName("Sshubhman");
        printStudentDetails(student1);
        printStudentDetails(student2);
        printStudentDetails(student3);
    }

    private static void printStudentDetails(Student student) {
        System.out.println("Student Id : " + student.getId());
        System.out.println("First Name : "+ student.getFirstName());
        System.out.println("Last Name : "+ student.getLastName());
        System.out.println("Email : "+ student.getEmail());
        System.out.println("-----------------------------");
    }
}
