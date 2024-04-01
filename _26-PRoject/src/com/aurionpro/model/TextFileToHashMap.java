package com.aurionpro.model;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextFileToHashMap {


    public static Map<String, Integer> readTextFileToHashMap(String filePath) {
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    int key = Integer.parseInt(parts[0].trim());
                    String value = parts[1].trim();
                    map.put(value, key);
                }
                if (parts.length == 3) {
                    String value = parts[0].trim() + " " + parts[1].trim();
                    int key = Integer.parseInt(parts[2].trim());
                    map.put(value, key);
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return map;
    }
}

