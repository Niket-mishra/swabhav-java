package com.aurionpro.test;

import com.aurionpro.model.*;


public class CarTest {
    public static void main(String[] args) {

        MarutiFactory marutiFactory= MarutiFactory.getMarutiFactory();

        ICars maruti = marutiFactory.makeCars();
        maruti.start();
        maruti.stop();

        TataFactory tataFactory = TataFactory.getInstance();
        ICars tata = tataFactory.makeCars();
        tata.start();
        tata.stop();

        MahindraFactory mahindraFactory =  MahindraFactory.getInstance();
        ICars mahindra = mahindraFactory.makeCars();
        mahindra.start();
        mahindra.stop();


    }
}
