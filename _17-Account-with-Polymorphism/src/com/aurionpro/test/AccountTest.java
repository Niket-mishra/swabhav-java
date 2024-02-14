package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1001, "Niket", 100000);
        CurrentAccount currentAccount = new CurrentAccount(1002, "Chaitanya", 10000);

        deposit(savingsAccount, 5000);
        deposit(savingsAccount, 5000);
        withdraw(savingsAccount, 10000);

    }

    public static void deposit(Account account, double amount) {
        if (account.deposit(amount)) {
            System.out.println("Deposit Successful of " + amount);
            System.out.println(account);
        } else {
            System.out.println("Deposit Failed");
            System.out.println(account);
        }
        System.out.println("-----------------------------");
    }
    public static void withdraw (Account account, double amount) {
        if (account.deposit(amount)) {
            System.out.println("Withdrawal Successful of " + amount);
            System.out.println(account);
        } else {
            System.out.println("Withdrawal Failed");
            System.out.println(account);
        }
        System.out.println("-----------------------------");
    }
}
