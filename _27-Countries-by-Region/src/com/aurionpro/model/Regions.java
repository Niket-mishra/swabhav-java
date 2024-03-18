package com.aurionpro.model;

import com.aurionpro.test.CountriesRegionTest;

public class Regions extends CountriesRegionTest {
    private String name;
    private int regionId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public Regions(String name, int regionId) {
        this.name = name;
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "Regions{" +
                "name='" + name + '\'' +
                ", regionId=" + regionId +
                '}';
    }
}
