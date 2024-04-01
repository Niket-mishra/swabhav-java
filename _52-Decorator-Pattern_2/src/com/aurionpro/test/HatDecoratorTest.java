package com.aurionpro.test;

import com.aurionpro.model.*;

public class HatDecoratorTest {
    public static void main(String[] args) {
        IHat standardHat = new StandardHat();
        RibbonedHat ribbonedHat = new RibbonedHat(standardHat);

        IHat premiumHat = new PremiumHat();
        RibbonedHat ribbonedHat1 = new RibbonedHat(premiumHat);
        GoldenHat goldenHat = new GoldenHat(ribbonedHat1);

        System.out.println(ribbonedHat.getName());
        System.out.println(ribbonedHat.getDescription());
        System.out.println(ribbonedHat.getPrice());
        System.out.println();

        System.out.println(goldenHat.getName());
        System.out.println(goldenHat.getDescription());
        System.out.println(goldenHat.getPrice());
    }
}
