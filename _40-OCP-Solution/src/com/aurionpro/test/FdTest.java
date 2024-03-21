package com.aurionpro.test;

import com.aurionpro.model.*;

public class FdTest {
    public static void main(String[] args) {
        FixedDeposit fd = new FixedDeposit("Niket",400000,6,new Diwali());
        FixedDeposit fd1 = new FixedDeposit("Nitesh",500000,6,new Eid());
        FixedDeposit fd2 = new FixedDeposit("Nitin",600000,6,new Holi());
        FixedDeposit fd3 = new FixedDeposit("Mukesh",700000,6,new NewYear());
        FixedDeposit fd4 = new FixedDeposit("Ramesh",800000,6,null);

        System.out.println(fd.calculateSimpleInterest());
        System.out.println(fd1.calculateSimpleInterest());
        System.out.println(fd2.calculateSimpleInterest());
        System.out.println(fd3.calculateSimpleInterest());
        System.out.println(fd4.calculateSimpleInterest());

    }
}