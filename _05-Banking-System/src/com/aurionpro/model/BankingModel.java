package com.aurionpro.model;

public class BankingModel {

    //Fields -
    private int accountNumber;
    private String name;
    private double balance;
    private AccountType accountType;

    private static final double MIN_SAVINGS_BALANCE = 1000;
    private static final double MIN_CURRENT_BALANCE = 5000;


    //Getters and Setters

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

    //Constructors
    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (accountType == AccountType.SAVINGS) {
            if (balance - amount > MIN_SAVINGS_BALANCE) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        } else if (balance - amount > MIN_CURRENT_BALANCE) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
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


