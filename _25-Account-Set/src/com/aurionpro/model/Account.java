package com.aurionpro.model;

import java.util.Objects;

public class Account {
private int acNo;
private String name;
private double salary;

    public Account(int acNo, String name, double salary) {
        this.acNo = acNo;
        this.name = name;
        this.salary = salary;
    }

    public int getAcNo() {
        return acNo;
    }

    public void setAcNo(int acNo) {
        this.acNo = acNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Account account = (Account) object;
        return acNo == account.acNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acNo);
    }

    @Override
    public String toString() {
        return "Account{" +
                "acNo=" + acNo +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
