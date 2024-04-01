package com.aurionpro.model;
public class Player implements Comparable<Player>{
    private int id;
    private String name;
    private int age;
    private String country;
    private int totalWicket;
    private int totalRuns;
    private int matchesCount;

    public Player(int id, String name, int age, String country, int totalWicket, int totalRuns, int matchesCount) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.totalWicket = totalWicket;
        this.totalRuns = totalRuns;
        this.matchesCount = matchesCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotalWicket() {
        return totalWicket;
    }

    public void setTotalWicket(int totalWicket) {
        this.totalWicket = totalWicket;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getMatchesCount() {
        return matchesCount;
    }

    public void setMatchesCount(int matchesCount) {
        this.matchesCount = matchesCount;
    }


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", totalWicket=" + totalWicket +
                ", totalRuns=" + totalRuns +
                ", matchesCount=" + matchesCount +
                '}';
    }



    @Override
    public int compareTo(Player o) {
        return this.matchesCount-o.matchesCount;
    }
}