package com.aurionpro.test;

import com.aurionpro.model.Human;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

import java.lang.annotation.Inherited;

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
@
    }
}
