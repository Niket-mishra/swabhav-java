package com.aurionpro.test;

import com.aurionpro.model.Player;

import java.util.Arrays;

public class PlayerTest {
    public static void main(String[] args) {
        Player[] players ={
                new Player(10,"Dhoni",40,"India",10,10000,200),
                new Player(7,"Yuvraj",30,"India",20,10000,140),
                new Player(5,"Hardik",30,"India",5,18000,100),
                new Player(20,"Rahul",35,"India",12,19000,170),
                new Player(18,"Virat",32,"India",11,25000,230),
        };
        Arrays.sort(players);
        for(Player x : players){
            System.out.println(x);
        };
    }
}