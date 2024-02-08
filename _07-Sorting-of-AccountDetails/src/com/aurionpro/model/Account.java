package com.aurionpro.model;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private AccountType accountType;

    private static final double MIN_SAVINGS_BALANCE = 1000;
    private static final double MIN_CURRENT_BALANCE = 5000;

    public Account(int accountNumber, String name, double balance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                "}\n"+"********************************";
    }
}
