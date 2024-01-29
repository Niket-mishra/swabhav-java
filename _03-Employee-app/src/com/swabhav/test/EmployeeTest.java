package com.swabhav.test;

import com.swabhav.model.Employee;

import java.time.LocalDate;
import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("Aman");
        employee1.setLastName("Kumar");
        employee1.setEmail("Aman@official.com");
        employee1.setStartDate(LocalDate.parse("2002-02-22"));

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstName("Suman");
        employee2.setLastName("Kumar");
        employee2.setEmail("Suman@official.com");
        employee2.setStartDate(LocalDate.parse("2002-02-22"));


        Employee employee3 = new Employee(
                3,
                "Raman",
                "Sharma",
                "Sharma@official.com",
                LocalDate.parse("2010-05-10")
        );

        printEmployeeDetails(employee1);
        printEmployeeDetails(employee2);
        printEmployeeDetails(employee3);
    }

    private static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Id : " + employee.getId());
        System.out.println("First Name : " + employee.getFirstName());
        System.out.println("Last Name : " + employee.getLastName());
        System.out.println("Email : " + employee.getEmail());
        System.out.println("Date of Joining : " + employee.getStartDate());
        System.out.println("-----------------------------");
    }

}
