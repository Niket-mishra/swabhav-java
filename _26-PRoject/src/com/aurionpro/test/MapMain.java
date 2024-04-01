package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import static com.aurionpro.model.TextFileToHashMap.readTextFileToHashMap;

public class MapMain {

    public static void main(String[] args) {
        String filePath = "D:\\swabhav java\\_26-PRoject\\src\\com\\aurionpro\\model\\Regions.txt";
        String filePath1 = "D:\\swabhav java\\_26-PRoject\\src\\com\\aurionpro\\model\\CountriesList.txt";

        Map<String, Integer> regionMap = readTextFileToHashMap(filePath);
        Map<String, Integer> countryMap = readTextFileToHashMap(filePath1);
        String countryCode = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 6) {
            System.out.println("Enter 1 to List all Region :");
            System.out.println("Enter 2 to List all Countries :");
            System.out.println("Enter 3 to List all Countries Based on Country Code :");
            System.out.println("Enter 4 to get Count of Countries in Each Region :");
            System.out.println("Enter 5 to Countries Based on Region :");
            System.out.println("Enter 6 to Exit :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (Map.Entry<String, Integer> entry : regionMap.entrySet()) {
                        System.out.println(entry.getValue() + " :" + entry.getKey());
                    }
                    break;
                case 2:
                    for (Map.Entry<String, Integer> entry1 : countryMap.entrySet()) {
                        System.out.println(entry1.getValue() + ": " + entry1.getKey());
                    }
                    break;
                case 3:
                    System.out.println("Enter a Country Code :");
                    String tempCode = sc.next();
                    boolean countryFound = false;
                    for (Map.Entry<String, Integer> entry1 : countryMap.entrySet()) {

                        String[] tempCountry = entry1.getKey().split(" ");
                        if(tempCountry[0].equalsIgnoreCase(tempCode)){
                            countryFound = true;
                            System.out.println("Found Code :"+tempCountry[0]+", Country Name : "+tempCountry[1]);
                        }
//                        String countryName = hashMap1.getOrDefault(countryCode);

//                        System.out.println("The country with code " + countryCode+"is"+countryName + ".");
                    }
                    if(!countryFound){
                        System.out.println("Invalid country code!!");
                    }
                    break;
            case 4:


        }

    }

}}

