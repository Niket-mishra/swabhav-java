package com.aurionpro.model;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private LocalDate dateOfJoining;
    private double salary;
    private String deptName;

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

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, LocalDate dateOfJoining, double salary, String deptName) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date of joining=" + dateOfJoining +
                ", salary=" + salary +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
