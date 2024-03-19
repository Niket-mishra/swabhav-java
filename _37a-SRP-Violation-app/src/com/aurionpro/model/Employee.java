package com.aurionpro.model;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private int id;
    private String name;
    private String city;
    private LocalDate doj;
    private double salary;

    public Employee(int id, String name, String city, LocalDate doj, double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.doj = doj;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public boolean isPromotionDue() {
        Period period = Period.between(getDoj(),LocalDate.now());
        if ((period.getYears() > 5) &&(getSalary()<=50000)) {
            return true;

        }
        return false;
    }
    public double annualSalary(){
        return 12*getSalary();
    }

}
