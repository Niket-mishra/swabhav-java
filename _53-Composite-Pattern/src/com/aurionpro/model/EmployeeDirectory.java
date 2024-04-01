package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployee{
    List<IEmployee> employees = new ArrayList<>();

    public EmployeeDirectory() {

    }
    public void addEmployees(IEmployee employee){
        employees.add(employee);
    }
    public void removeEmployees(IEmployee employee){
        employees.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for (IEmployee e : employees){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "EmployeeDirectory{" +
                "employees=" + employees +
                '}';
    }
}
