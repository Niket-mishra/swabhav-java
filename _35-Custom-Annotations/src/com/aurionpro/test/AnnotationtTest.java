package com.aurionpro.test;

import java.lang.annotation.*;
//
//import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.lang.reflect.*;


import com.aurionpro.model.Anno;
import com.aurionpro.model.Important;

public class AnnotationtTest {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        String name = "Niket";

        Class c = null;
        try {
            c = Class.forName("java.lang.annotation.Repeatable");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Annotation[] annotations = c.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("Annotation : " + annotation);
            System.out.println("Name of Annotations: " + annotation.getClass());
        }
        Class[] classes = c.getDeclaredClasses();
        for (Class class1 : classes) {
            System.out.println("class: " + class1);
            System.out.println("Name of class: " + class1.getName());
        }
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Methods: " + method);
            System.out.println("Name of methods: " + method.getName());
        }
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor: " + constructor);
            System.out.println("Name of Constructors: " + constructor.getName());
        }
    }
}
