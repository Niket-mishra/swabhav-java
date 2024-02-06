package com.aurionpro.test;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        printCircle(c1);

        Circle c2 = new Circle(5, BorderType.DASHED, Color.BLUE);
        printCircle(c2);

        Circle c3 = new Circle();
        c3.setRadius(4);
        c3.setBorderType(BorderType.DOTTED);
        c3.setColor(Color.YELLOW);
        printCircle(c3);

    }

    private static void printCircle(Circle circle) {
        System.out.println("Radius :"+circle.getRadius());
        System.out.println("BorderType :"+circle.getBorderType());
        System.out.println("Color :"+circle.getColor());
        System.out.println("Area of Circle :"+circle.calculateArea());
        System.out.println("-----------------------------------------");
    }
}
