package com.aurionpro.test;

import com.aurionpro.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Niket",List.of("Dancing","Singing","Swimming")));
        students.add(new Student(2,"Nick",List.of("Running","Singing","Reading")));
        students.add(new Student(3,"Nike",List.of("Travelling","Hiking","Swimming")));
        students.add(new Student(4,"Nitin",List.of("Playing","Singing","Swimming")));
    Set<String> hobbies = new HashSet<>();
        for (Student student : students) {
            hobbies.addAll(student.getHobbies());
        }
        System.out.println(hobbies);
//        hobbies.stream().collect(Collections.addAll())
        Set<String> collect = students.stream().flatMap(stud -> stud.getHobbies().stream()).collect(Collectors.toSet());
        System.out.println(collect);
    }


}
