package com.aurionpro.model;

public class TataFactory implements IFactory{
    private static TataFactory tataFactory;
    @Override
    public ICars makeCars() {
        return new Tata();
    }
    private TataFactory(){

    }
    public static TataFactory getInstance(){
        if (tataFactory == null){
            return new TataFactory();
        }
        return tataFactory;
    }
}
