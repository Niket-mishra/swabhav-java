package com.aurionpro.model;

import java.util.Random;

public class Game {

    static final int min = 1;
    static final int max = 300;

    static int score= 0;

    static int totalScore = 0;

    public static void CalculateScore(Player player) {

        Random random = new Random();
        int turn = 1;
        int page_no = 1;


        while (page_no % 7 != 0) {

            page_no = random.nextInt(max+min);
            System.out.println("Page no : " + page_no);
            score = page_no % 7;
            System.out.println("Score on " + turn + " Turn : " + score);
            System.out.println("Turn No : " + turn);
            turn++;

            totalScore += score;
            player.setTotalScore(totalScore);
            player.setTurns(turn);
            System.out.println("Total Score of "+player.getName()+" : " + totalScore);
            System.out.println("----------------------------------------------------");

        }
        System.out.println(player.getName()+" Game Ends ");
        System.out.println("----------------------------------------------------");
        System.out.println();

    }
    public static void GenerateWinner(Player player1,Player player2){
        if (player1.getTotalScore() > player2.getTotalScore()) {
            System.out.println(player1.getName()+" is Winner");
        } else if (player1.getTotalScore()< player2.getTotalScore()) {
            System.out.println(player2.getName()+" is Winner");
        }else System.out.println("Match is Tie");
    }
}
