package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Rectangle square = new Square(10);
        System.out.println(isRectangle(rectangle));
        System.out.println(isRectangle(square));

    }
    public static boolean isRectangle(Rectangle obj) {
        int height = obj.getHeight();
        int prev = obj.getWidth();
        obj.setHeight(100);
        boolean b = false;
        if (height != obj.getHeight()) {
            int curr = obj.getWidth();
            b = prev == curr;
        }


        return b;
    }

}

