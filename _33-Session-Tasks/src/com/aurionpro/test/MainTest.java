package com.aurionpro.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String[] args) {
        String[] names = new String[5];
        try {
            Scanner sc = new Scanner(new File("D:\\swabhav java\\_33-Session-Tasks\\src\\com\\aurionpro\\model\\test.txt"));
            while (sc.hasNextLine()) {
                String tempString = sc.nextLine();
                names = tempString.split(",");
                System.out.println(names);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (String x : names) {
            System.out.println("Using filereader" + x.replace("\"", ""));
        }
        Arrays.stream(names).forEach(s -> System.out.println("Using Stream :" + s));
        // 3.
        List<String> collect = Arrays.stream(names).sorted().limit(3).toList();
        System.out.println("Sorted Ascending Order" + collect);
        List<String> a = Arrays.stream(names).filter(MainTest::test).sorted().toList();
        System.out.println(a);

    }

    private static boolean test(String s) {
        if (s.toLowerCase().contains("a")) {
            return true;
        }return false;
    }
}

