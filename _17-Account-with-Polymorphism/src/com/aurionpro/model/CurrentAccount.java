package com.aurionpro.model;

public class CurrentAccount extends Account{
    public CurrentAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }
   private final double OVER_DRAFT=10000;
    @Override
    public boolean withdraw(double amount){
        if (amount <= (OVER_DRAFT+ getBalance())) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}
