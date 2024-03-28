package com.aurionpro.test;

import com.aurionpro.model.Singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest implements Serializable {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        try {
            String filename ="D:\\swabhav java\\_48-Serialization-Singelton\\src\\com\\aurionpro\\model\\demo.txt";
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(singleton);

            out.close();
            file.close();




        } catch (IOException e) {
            System.out.println("Exception...");
            throw new RuntimeException(e);
        }



    }
}
