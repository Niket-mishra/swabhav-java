package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FdTest {
    public static void main(String[] args) {
        FixedDeposit fixedDeposit = new FixedDeposit("Niket",100000,1, FestivalType.DIWALI);
        FixedDeposit fixedDeposit1 = new FixedDeposit("Nitesh",50000,2,FestivalType.CHRISTMAS);

        System.out.println(fixedDeposit.getInterestRates());
        System.out.println(fixedDeposit1.getInterestRates());
        System.out.println(fixedDeposit.calculateInterest());
        System.out.println(fixedDeposit1.calculateInterest());



    }
}
