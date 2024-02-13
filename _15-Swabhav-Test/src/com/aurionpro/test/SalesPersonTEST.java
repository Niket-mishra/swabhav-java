package com.aurionpro.test;

import com.aurionpro.model.SalesPerson;

import java.util.Arrays;

import static com.aurionpro.model.SalesPerson.maxSales;

public class SalesPersonTEST{
    public static void main(String[] args) {
        SalesPerson[] persons = {
                new SalesPerson(1,"nick",100,"Aurion PRO"),
                new SalesPerson(2,"Chetan",10,"Aurion PRO"),
                new SalesPerson(3,"Niket",1000,"Swabhav"),
                new SalesPerson(4,"Adam",102,"Swabhav"),
                new SalesPerson(5,"JAck",12,"Google"),
                new SalesPerson(6,"David",109,"Qack"),
        };
        Arrays.sort(persons);
        for (SalesPerson x : persons){
            System.out.println(x);
        }
        System.out.println("The Person with Max Sales "+maxSales(persons));
    }
}
