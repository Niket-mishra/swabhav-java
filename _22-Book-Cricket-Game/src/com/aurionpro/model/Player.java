package com.aurionpro.model;

public class Player {
    private String name;
    private int score;
    private int turns;
    private int totalScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", turns=" + turns +
                ", totalScore=" + totalScore +
                '}';
    }
}
