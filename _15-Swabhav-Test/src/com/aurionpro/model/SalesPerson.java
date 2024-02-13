package com.aurionpro.model;

public class SalesPerson implements Comparable<SalesPerson>{
    private int id;
    private String name;
    private int totalSales;
    private String companyName;

    public SalesPerson(int id, String name, int totalSales, String companyName) {
        this.id = id;
        this.name = name;
        this.totalSales = totalSales;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public SalesPerson() {
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

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
    public static SalesPerson maxSales(SalesPerson[] person){

        SalesPerson maxSalesPerson = person[0];
        for (int i = 1; i < person.length; i++) {
                if(person[i].totalSales > maxSalesPerson.totalSales) {
                   maxSalesPerson = person[i];
                }
        }
        return maxSalesPerson;


    }


    @Override
    public int compareTo(SalesPerson o) {
        return this.companyName.compareTo(o.companyName);
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalSales=" + totalSales +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
