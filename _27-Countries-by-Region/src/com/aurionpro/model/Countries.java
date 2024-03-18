package com.aurionpro.model;

public class Countries {
    private int regionId;
    private String code;
    private String name;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Countries(int regionId, String code, String name) {
        this.regionId = regionId;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "regionId=" + regionId +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
