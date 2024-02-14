package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1001,"Niket",100000);
        savingsAccount.deposit(10000);
        System.out.println("Updated Balance = "+savingsAccount.getBalance());
        System.out.println();

        savingsAccount.withdraw(100000);
        System.out.println("Updated Balance = "+savingsAccount.getBalance());
        savingsAccount.withdraw(10000);
        System.out.println("Updated Balance = "+savingsAccount.getBalance()+"\n");

        CurrentAccount currentAccount = new CurrentAccount(1002,"Chaitanya",10000);
        currentAccount.deposit(10000);
        System.out.println("Updated Balance = "+currentAccount.getBalance());
        currentAccount.withdraw(20000);
        System.out.println("Updated Balance = "+currentAccount.getBalance());
        currentAccount.withdraw(1000);
        System.out.println("Updated Balance = "+currentAccount.getBalance());
        currentAccount.withdraw(10000);
        System.out.println("Updated Balance = "+currentAccount.getBalance());
    }
}
