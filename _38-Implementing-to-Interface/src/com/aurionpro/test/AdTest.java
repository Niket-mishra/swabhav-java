package com.aurionpro.test;

import com.aurionpro.model.Advertisement;
import com.aurionpro.model.Monitor;
import com.aurionpro.model.Projector;

public class AdTest {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Projector projector = new Projector();
        Advertisement advertisement = new Advertisement();
        advertisement.setDp(monitor);
        advertisement.showAd();
        advertisement.setDp(projector);
        advertisement.showAd();


    }
}
