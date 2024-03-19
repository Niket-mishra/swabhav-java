package com.aurionpro.test;

import com.aurionpro.model.Employee;

import java.time.LocalDate;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Niket","Mumbai", LocalDate.of(2010,10,10),49000);
        Employee employee2 = new Employee(2,"Ramesh","Navi Mumbai", LocalDate.of(2015,3,15),54000);
        Employee employee3 = new Employee(3,"Suresh","Thane", LocalDate.of(2018,4,16),45000);
        Employee employee4 = new Employee(4,"Mahesh","Pune", LocalDate.of(2021,9,18),47000);
        Employee employee5 = new Employee(5,"Nitesh","Surat", LocalDate.of(2022,12,19),50000);
        Employee employee6 = new Employee(6,"Ritesh","Rajkot", LocalDate.of(2020,11,30),60000);

        System.out.println(employee1.isPromotionDue());
        System.out.println(employee2.isPromotionDue());
        System.out.println(employee3.isPromotionDue());
        System.out.println(employee4.isPromotionDue());
        System.out.println(employee5.isPromotionDue());
        System.out.println(employee6.isPromotionDue());

        System.out.println(employee1.annualSalary());
        System.out.println(employee6.annualSalary());
    }
}
