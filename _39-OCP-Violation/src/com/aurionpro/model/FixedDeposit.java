package com.aurionpro.model;

import static com.aurionpro.model.FestivalType.*;

public class FixedDeposit {
    private String name;
    private double principal;
    private int duration;
    private FestivalType festivalType;

    public FixedDeposit(String name, double principal, int duration,FestivalType festivalType) {
        this.name = name;
        this.principal = principal;
        this.duration = duration;
        this.festivalType =festivalType;
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
    public double getInterestRates(){
        if (this.festivalType == CHRISTMAS) {
            return 7.50;
        } else if (this.festivalType == DIWALI) {
            return 9.00;
        } else if (this.festivalType==EID) {
            return 6.50;
        }else if(this.festivalType==NEWYEAR){
            return 8.00;
        }
        else return 6.00;
    }
    public double calculateInterest(){
        return getPrincipal()*getInterestRates()*getDuration()/100;
    }

    public FestivalType getFestivalType() {
        return festivalType;
    }

    public void setFestivalType(FestivalType festivalType) {
        this.festivalType = festivalType;
    }
}
