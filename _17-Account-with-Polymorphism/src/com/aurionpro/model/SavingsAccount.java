package com.aurionpro.model;

public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    private final double MIN_BALANCE = 1000;

    @Override
    public boolean withdraw(double amount) {
        if (this.getBalance() - amount >= MIN_BALANCE) {
            setBalance(this.getBalance() - amount);
            return true;
        }
        return false;
    }
}
