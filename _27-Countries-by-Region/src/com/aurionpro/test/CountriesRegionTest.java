package com.aurionpro.test;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Regions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class CountriesRegionTest {


    public static void main(String[] args) {


        String filepath = "D:\\swabhav java\\_26-PRoject\\src\\com\\aurionpro\\model\\CountriesList.txt";
        List<Regions> regionsList = new ArrayList<>();
        List<Countries> countriesList = new ArrayList<>();
        Map<Integer, List<Countries>> regionCountryMap = new HashMap<>();
        try {
            Scanner sc = new Scanner(new File("D:\\swabhav java\\_27-Countries-by-Region\\src\\com\\aurionpro\\model\\Country.txt"));
            while (sc.hasNextLine()) {
                String tempString = sc.nextLine();
                String[] spl = tempString.split(",");
                Countries tempCountries = new Countries(Integer.parseInt(spl[2].trim()), spl[0].trim(), spl[1].trim());
                countriesList.add(tempCountries);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {

            Scanner sc1 = new Scanner(new File("D:\\swabhav java\\_27-Countries-by-Region\\src\\com\\aurionpro\\model\\Region.txt"));
            while (sc1.hasNextLine()) {
                String tempString1 = sc1.nextLine();
                String[] strings = tempString1.split(",");
                Regions tempRegions = new Regions(strings[1], Integer.parseInt(strings[0]));
                regionsList.add(tempRegions);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Countries> tempCountries;
        for (Countries x : countriesList) {
            if (regionCountryMap.containsKey(x.getRegionId())) {
                tempCountries = regionCountryMap.get(x.getRegionId());
            } else {
                tempCountries = new ArrayList<>();
            }
            tempCountries.add(x);
            regionCountryMap.put(x.getRegionId(), tempCountries);
        }
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
                    System.out.println(regionsList);
                    break;
                case 2:
                    System.out.println(countriesList);
                    break;
                case 3:
                    System.out.println("Enter a Country Code :");
                    boolean CountryFound = false;
                    String ans = sc.next();
                    for (Countries x : countriesList) {
                        if (x.getCode().equalsIgnoreCase(ans)) {
                            System.out.println("Country Found :\n" + x);
                            CountryFound = true;
                        }
                    }
                    if (!CountryFound) {
                        System.out.println("Not Found !!!!!");
                    }
                    break;
                case 4:
                    Integer s = null;
                    Regions tempRegion = null;
                    Set<Integer> keys = regionCountryMap.keySet();
                    for (Integer i : keys) {
                        for (Regions r : regionsList) {
                            if (r.getRegionId() == i) {
                                tempRegion = r;
                            }
                        }
                        s = regionCountryMap.get(i).size();
                        System.out.println("Region name :" + tempRegion.getName() + ", count of countries : " + s);
                    }
                    break;
                case 5:
                    System.out.println(regionCountryMap);
                    break;
            }
        }
    }
}
