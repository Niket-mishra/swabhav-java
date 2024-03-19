package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.Employee;
import com.aurionpro.model.HR;

import java.io.ObjectInput;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.StringJoiner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Niket","Mumbai", LocalDate.of(2015,10,18),49000);
        Employee employee1 = new Employee(2,"Nitin","Thane", LocalDate.of(2021,1,19),59000);
        Employee employee2 = new Employee(3,"Nitesh","Navi Mumbai", LocalDate.of(2015,1,19),59000);
        Employee employee3 = new Employee(4,"Ramesh","Pune", LocalDate.of(2021,1,19),29000);

        HR hr = new HR();
        boolean promotionDue = hr.isPromotionDue(employee);
        boolean promotionDue1 = hr.isPromotionDue(employee1);
        boolean promotionDue2 = hr.isPromotionDue(employee2);
        boolean promotionDue3 = hr.isPromotionDue(employee3);
        printDetails(promotionDue,employee);
        printDetails(promotionDue1,employee1);
        printDetails(promotionDue2,employee2);
        printDetails(promotionDue3,employee3);

        Account account = new Account();
        double v1= account.annualSalary(employee);
        double v2 = account.annualSalary(employee1);
        double v3 = account.annualSalary(employee2);
        double v4 = account.annualSalary(employee3);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);


    }

    private static void printDetails(boolean promotionDue,Employee e) {
        System.out.println(e.getName()+" Promotion Due is "+promotionDue);
    }
}
