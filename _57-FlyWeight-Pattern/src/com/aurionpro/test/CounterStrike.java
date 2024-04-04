package com.aurionpro.test;

import com.aurionpro.model.IPlayer;
import com.aurionpro.model.PlayerFactory;

import java.util.Random;

public class CounterStrike {
    private static final String[] playerType =
            {"Terrorist", "CounterTerrorist"};
    private static final String[] weapons =
            {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
//            String randPlayerType = getRandPlayerType();
//            System.out.println(randPlayerType);
            IPlayer p = PlayerFactory.getPlayer(getRandPlayerType());
            p.assignWeapon(getRandWeapon());
            p.mission();

        }

    }

    public static String  getRandPlayerType() {
        Random r = new Random();

        int randInt = r.nextInt(playerType.length);

        return playerType[randInt];
    }

    public static String getRandWeapon() {
        Random r = new Random();

        int randInt = r.nextInt(weapons.length);

        return weapons[randInt];
    }
}
