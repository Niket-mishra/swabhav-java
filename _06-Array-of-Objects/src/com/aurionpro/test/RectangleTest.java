package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle();
            System.out.println("Enter length :");
            rectangles[i].setLength(sc.nextInt());
            System.out.println("Enter breadth :");
            rectangles[i].setBreadth(sc.nextInt());
            System.out.println("Area :" + rectangles[i].calculateArea());
        }
    }
}
