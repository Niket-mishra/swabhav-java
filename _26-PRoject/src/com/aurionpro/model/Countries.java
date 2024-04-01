package com.aurionpro.model;

public class Countries {
    private int id;
    private String name;
    private String regionId;

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

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Countries(int id, String name, String regionId) {
        this.id = id;
        this.name = name;
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regionId='" + regionId + '\'' +
                '}';
    }
}
