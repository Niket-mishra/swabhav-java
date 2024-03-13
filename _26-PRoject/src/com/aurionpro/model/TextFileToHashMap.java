package com.aurionpro.model;


    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

    public class TextFileToHashMapExample {
        public static void main(String[] args) {
            String filePath = "D:\\swabhav java\\_26-PRoject\\src\\com\\aurionpro\\model\\Regions.txt";

            Map<String, Integer> hashMap = readTextFileToHashMap(filePath);


            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey() +": "+entry.getValue());
            }
        }

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
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return map;
        }
    }

