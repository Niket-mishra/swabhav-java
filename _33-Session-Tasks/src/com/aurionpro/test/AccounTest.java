package com.aurionpro.test;

import com.aurionpro.model.Account;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AccounTest {
    public static void main(String[] args) {
        Account[] accounts = {
                new Account(1001,"Niket",10000),
                new Account(1002,"Naman",20000),
                new Account(1003,"Nirmit",30000),
                new Account(1004,"Nitesh",40000),
                new Account(1005,"Nimesh",50000),
                new Account(1006,"Nick",60000),
        };

        Optional<Account> min = Arrays.stream(accounts).min(Comparator.comparingDouble(Account::getSalary));
        System.out.println(min.get());
        Optional<Account> max = Arrays.stream(accounts).max(Comparator.comparingDouble(Account::getSalary));
        System.out.println(max.get());
        List<Account> list = Arrays.stream(accounts).sorted(Comparator.comparingDouble(Account::getSalary)).toList();
        System.out.println(list);
    }



}
