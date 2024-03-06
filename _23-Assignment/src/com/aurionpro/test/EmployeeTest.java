package com.aurionpro.test;

import com.aurionpro.java.IdCompare;
import com.aurionpro.java.Model;
import com.aurionpro.java.NameCompare;
import com.aurionpro.java.SalaryCompare;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {

        List models = new ArrayList<>();
        {
            models.add(new Model(1, "Niket", 100000));
            models.add(new Model(2, "Rohit", 150000));
            models.add(new Model(3, "Nick", 200000));
            models.add(new Model(4, "Aman", 250000));
            models.add(new Model(5, "John", 120000));

        }
        ;
        NameCompare nameCompare = new NameCompare();
        IdCompare idCompare = new IdCompare();
        SalaryCompare salaryCompare = new SalaryCompare();
        Scanner sc = new Scanner(System.in);



        int choice = 0;

        while (choice != 4) {
            System.out.println(" Enter 1 to sort by Name \n Enter 2 to sort by Id \n Enter 3 to sort by Salary\n Enter 4 to Exit\n ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Sorted According to Name : ");
                Collections.sort(models, nameCompare);
                System.out.println(models);
                System.out.println();
                break;
                case 2:
                System.out.println("Sorted According to Id : ");
                Collections.sort(models, idCompare);
                System.out.println(models);
                System.out.println();
                break;
                case 3:
                System.out.println("Sorted According to Salary : ");
                Collections.sort(models,nameCompare);
                System.out.println(models);
                System.out.println();
                break;
            }
        }
    }
}
