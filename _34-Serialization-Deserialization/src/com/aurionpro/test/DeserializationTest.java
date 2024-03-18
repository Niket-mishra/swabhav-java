package com.aurionpro.test;

import com.aurionpro.model.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

public class DeserializationTest implements Serializable {
    public static void main(String[] args) {
        List<Employee> employee1;
        String filename = "Myobject.ser";
        try
        {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);


            employee1 = (List<Employee>) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            for (Employee employee : employee1) {
                System.out.println(employee.getName());
            }
//            System.out.println(employee1);
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
