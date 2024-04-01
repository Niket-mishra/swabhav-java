package com.aurionpro.test;

import com.aurionpro.model.Account;

import java.util.HashSet;
import java.util.Set;

public class AccountTest {
    public static void main(String[] args) {
        Set<Account> accountSet = new HashSet<>();
        accountSet.add(new Account(1001,"Niket",15000));
        accountSet.add(new Account(1001,"Niket",15000));

        System.out.println(accountSet);
    }
}
