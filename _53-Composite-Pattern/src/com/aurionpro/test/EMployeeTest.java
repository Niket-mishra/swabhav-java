package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.EmployeeDirectory;
import com.aurionpro.model.IEmployee;
import com.aurionpro.model.Manager;

import java.util.List;

public class EMployeeTest {
    public static void main(String[] args) {
        IEmployee dev1 = new Developer("Suyash","Junior Developer");
        IEmployee dev12 = new Developer("Mahesh","Senior Developer");

        IEmployee man1 = new Manager("Dilip","Dotnet Manager");
        IEmployee man2 = new Manager("Dinesh","ANS Manager");



        EmployeeDirectory devDirectory = new EmployeeDirectory();
        devDirectory.addEmployees(dev1);
        devDirectory.addEmployees(dev12);
        EmployeeDirectory manDirectory = new EmployeeDirectory();
        manDirectory.addEmployees(man1);
        manDirectory.addEmployees(man2);

        EmployeeDirectory compDiectory = new EmployeeDirectory();
        compDiectory.addEmployees(devDirectory);
        compDiectory.addEmployees(manDirectory);

        compDiectory.showEmployeeDetails();




    }
}
