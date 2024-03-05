package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("*-------Player 1--------*");
        final int min = 1;
        final int max = 300;
        int p1_score = 0;
        int p2_score = 0;
        int p1_page_no = 1;
        int p2_page_no = 1;
        int turn =1;
        int p1_totalScore = 0;
        int p2_totalScore = 0;

        while(p1_page_no % 7 != 0){
            p1_page_no = random.nextInt(max + min);

            System.out.println("Page no : " + p1_page_no);

            p1_score = p1_page_no % 7;
            System.out.println("Score on "+turn+" Turn : " + p1_score);
            System.out.println("Turn No : " + turn);
            turn++;

            p1_totalScore += p1_score;
            System.out.println("Total Score of Player 1 : " + p1_totalScore);

            System.out.println("----------------------------------------------------");

        }
        while(p2_page_no % 7 != 0){
            p2_page_no = random.nextInt(max + min);

            System.out.println("Page no :" + p2_page_no);

            p2_score = p2_page_no % 7;
            System.out.println("Score on "+turn+" Turn : " + p2_score);
            System.out.println("Turn No : " + turn);
            turn++;

            p2_totalScore += p2_score;
            System.out.println("Total Score of Player 2 : " + p2_totalScore);

            System.out.println("--------------------------------------------------");
        }
        if (p1_totalScore > p2_totalScore) {
            System.out.println("*------ Player 1 is the Winner ------*");
        } else if (p1_totalScore==p2_totalScore) {
            System.out.println("*------ Match is Tie ------*");
        } else System.out.println("*------ Player 2 is the Winner ------*");



    }
}