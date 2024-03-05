package com.aurionpro.test;

import com.aurionpro.model.Game;
import com.aurionpro.model.Player;

import java.util.Scanner;

public class PlayerTest extends Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player1= new Player();
        System.out.println("Player 1 \nEnter Your Name :");
        player1.setName(sc.next());
        Player player2 = new Player();
        System.out.println("Player 2 \nEnter Your Name :");
        player2.setName(sc.next());
        CalculateScore(player1);
        CalculateScore(player2);
        GenerateWinner(player1,player2);
        System.out.println(player1);
    }
}
