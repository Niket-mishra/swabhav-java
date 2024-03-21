package com.aurionpro.model;

public class FixedDeposit {
    private String name;
    private double principal;
    private int duration;
    private IFestival festival;

    public FixedDeposit(String name, double principal, int duration, IFestival festival) {
        this.name = name;
        this.principal = principal;
        this.duration = duration;
        this.festival = festival;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public IFestival getFestival() {
        return festival;
    }

    public void setFestival(IFestival festival) {
        this.festival = festival;
    }
    public double calculateSimpleInterest(){
        if (festival == null) {
            return 6.50*duration*principal/100;
        }
        return festival.getInterestRates()*duration*principal/100;
    }
}
