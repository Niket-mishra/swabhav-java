package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {
    public static void main(String[] args) {
        Account[] accounts = {
                new Account(1, "Niket", 20000, AccountType.SAVINGS),
                new Account(2, "Adam", 10000, AccountType.SAVINGS),
                new Account(3, "Nick", 30000, AccountType.SAVINGS),
                new Account(4, "Joe", 50000, AccountType.SAVINGS),
                new Account(5, "Satish", 40000, AccountType.SAVINGS),

        };
        sortAccounts(accounts);
        printAccountDetails(accounts);

    }

    private static void printAccountDetails(Account[] accounts) {
        for (Account x : accounts) {


            System.out.println("ID :" + x.getAccountNumber());
            System.out.println("Name :" + x.getName());
            System.out.println("Account Type :" + x.getAccountType());
            System.out.println("Balance :" + x.getBalance());
            System.out.println("------------------------------------------------");
        }

    }

    private static void sortAccounts(Account[] accounts) {

        int n = accounts.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
                    Account temp = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = temp;

                }
    }
}

