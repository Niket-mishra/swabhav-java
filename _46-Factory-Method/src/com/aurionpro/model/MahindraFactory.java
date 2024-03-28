package com.aurionpro.model;

public class MahindraFactory implements IFactory{
    private static MahindraFactory mahindraFactory;
    @Override
    public ICars makeCars() {
        return new Mahindra();
    }
    private MahindraFactory(){

    }
    public static MahindraFactory getInstance(){
        if (mahindraFactory==null) return new MahindraFactory();
        return mahindraFactory;
    }
}
