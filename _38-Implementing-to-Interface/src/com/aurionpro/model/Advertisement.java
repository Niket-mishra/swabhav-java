package com.aurionpro.model;

public class Advertisement {
    IDisplayable dp;

    public void setDp(IDisplayable disp) {
        this.dp = disp;

    }


    public void showAd() {
        dp.display();
    }

}
