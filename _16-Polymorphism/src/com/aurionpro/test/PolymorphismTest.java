package com.aurionpro.test;

import com.aurionpro.model.Human;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class PolymorphismTest {
    public static void main(String[] args) {

//------------------ Case 1 ---------------------
        System.out.println("------------------ Case 1 ---------------------");
        Human h1 = new Human();
        h1.eat();
        h1.play();
        h1.sleep();
//------------------ Case 2 ---------------------
        System.out.println("------------------ Case 2 ---------------------");
        Man m1 = new Man();
        m1.play();
        m1.read();
        m1.sleep();
        m1.read();
//------------------ Case 3 ---------------------
        System.out.println("------------------ Case 3 ---------------------");
        Human h2 = new Kid();
        h2.eat();
        h2.play();
        h2.sleep();

//------------------ Case 4 ---------------------
        System.out.println("------------------ Case 4 ---------------------");
        playInPark(new Human());
        playInPark(new Man());
        playInPark(new Kid());

//------------------ Case 5 ---------------------
        System.out.println("------------------ Case 5 ---------------------");
        readInLibrary(new Human());
        readInLibrary(new Man());
        readInLibrary(new Kid());
    }

    private static void readInLibrary(Human human) {
        if (human instanceof Man) {
            Man man = (Man) human;
            man.read();
        } else System.out.println("This Humans Can't Read");
    }

    private static void playInPark(Object human) {
        if (human instanceof Human) {
            ((Human) human).play();
        }
    }
}
