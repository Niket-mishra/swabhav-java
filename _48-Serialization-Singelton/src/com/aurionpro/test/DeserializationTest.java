package com.aurionpro.test;

import com.aurionpro.model.Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;


public class DeserializationTest implements Serializable {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        try
        {

            String filename ="D:\\swabhav java\\_48-Serialization-Singelton\\src\\com\\aurionpro\\model\\demo.txt";
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);


            Singleton singleton1 = (Singleton) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println(singleton1);
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
