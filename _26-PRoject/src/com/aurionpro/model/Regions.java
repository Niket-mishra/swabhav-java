package com.aurionpro.model;

public class Regions {
    private int regionId;
    private String region;
    private String Countries;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountries() {
        return Countries;
    }

    public void setCountries(String countries) {
        Countries = countries;
    }

    public Regions(int regionId, String region, String countries) {
        this.regionId = regionId;
        this.region = region;
        Countries = countries;
    }

    @Override
    public String toString() {
        return "Regions{" +
                "regionId=" + regionId +
                ", region='" + region + '\'' +
                ", Countries='" + Countries + '\'' +
                '}';
    }
}

