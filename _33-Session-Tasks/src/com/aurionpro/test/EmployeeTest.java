package com.aurionpro.test;

import com.aurionpro.model.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(101,"Niket", LocalDate.of(2017, 1, 13),20000,"Swabhav VentureLabs"),
                new Employee(102,"Nick",LocalDate.of(2023,10,20),30000,"Swabhav TechLabs"),
                new Employee(103,"Ramesh",LocalDate.of(2020,11,19),40000,"Swabhav VentureLabs"),
                new Employee(104,"Suresh",LocalDate.of(2010,9,22),50000,"Swabhav TechLabs"),
                new Employee(105,"Nitesh",LocalDate.of(2010,3,6),10000,"Aurion Pro"),
        };
        System.out.println(Arrays.toString(employees));
        List<Employee> list = Arrays.stream(employees).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).filter(x -> x.getSalary() > 20000).toList();
        System.out.println("List of Employees Salary >20,000 :"+list);
        Optional<Employee> min = Arrays.stream(employees).min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Minimum Salary :"+min);
        Optional<Employee> max = Arrays.stream(employees).max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("maximum Salary :"+ max);
//        Arrays.stream(employees).allMatch(x->x.getDateOfJoining().compareTo(LocalDate.from(LocalDate.of(2002,1,1)).compareTo(LocalDate.now())));
    }
}
