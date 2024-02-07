package com.aurionpro.test;

import com.aurionpro.model.AccountType;
import com.aurionpro.model.BankingModel;

public class Banking {
    public static void main(String[] args) {
        BankingModel p1 = new BankingModel();
        p1.setAccountNumber(1);
        p1.setName("Niket");
        p1.setAccountType(AccountType.SAVINGS);
        p1.setBalance(5000.00);

        p1.withdraw(15000.02);
        printUser(p1);
        transactionDetails(p1, 20000);
    }

    private static void transactionDetails(BankingModel account, double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Transaction successful");
            System.out.println(account);
        } else {
            System.out.println("Transaction Failed(Insufficient balance), for amount " + amount);
            System.out.println("Your Balance is " + account.getBalance());
        }


    }

    private static void printUser(BankingModel person) {
        System.out.println("ID :" + person.getAccountNumber());
        System.out.println("Name :" + person.getName());
        System.out.println("Account Type :" + person.getAccountType());
        System.out.println("Balance :" + person.getBalance());
        System.out.println("------------------------------------------------");
    }

}
