package com.aurionpro.model;

public class MarutiFactory implements IFactory{
    private static MarutiFactory marutiFactory;
    @Override
    public ICars makeCars() {
        return new Maruti();
    }

    private MarutiFactory() {
    }

    public static MarutiFactory getMarutiFactory(){
        if (marutiFactory == null){
            marutiFactory= new MarutiFactory();
        }
        return marutiFactory;
    }
}
