package com.aurionpro.test;

import com.aurionpro.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationTest implements Serializable {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Niket", 10000));
        employees.add(new Employee(201, "Nike", 20000));
        employees.add(new Employee(301, "Nick", 30000));
        employees.add(new Employee(401, "Nitesh", 40000));
        employees.add(new Employee(501, "Nitin", 14000));

        String filename = "D:\\swabhav java\\_34-Serialization-Deserialization\\src\\com\\aurionpro\\model\\myobject.txt";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(employees);

            out.close();
            file.close();
            System.out.println(employees);



        } catch (IOException e) {
            System.out.println("Exception...");
            throw new RuntimeException(e);
        }


    }
}
