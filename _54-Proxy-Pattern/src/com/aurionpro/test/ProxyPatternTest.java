package com.aurionpro.test;

import com.aurionpro.model.IImage;
import com.aurionpro.model.ProxyImage;

public class ProxyPatternTest
{
    public static void main(String[] args) {
        IImage image = new ProxyImage("example.jpg");

        image.display();

        image.display();
    }
}
