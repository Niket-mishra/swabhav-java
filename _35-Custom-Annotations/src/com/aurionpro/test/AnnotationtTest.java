package com.aurionpro.test;

import java.lang.annotation.*;


import com.aurionpro.model.Important;

public class AnnotationtTest {
//    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        @Important String name = "Niket";
        Class c = null;
        try {
            c = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Annotation[] annotations = c.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("Annotation : "+ annotation);
        }
        Class[] classes = c.getDeclaredClasses();
        for(Class class1 : classes) {
            System.out.println("class: "+class1);
            System.out.println("Name of class: "+class1.getName());
    }
}}
