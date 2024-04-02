package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.IShape;
import com.aurionpro.model.ShapeClient;

public class ProtoTypeTest {
    public static void main(String[] args) {

        IShape circlePrototype = new Circle("red");
        ShapeClient client = new ShapeClient(circlePrototype);
        IShape redCircle = client.createShape();

        redCircle.draw();
    }
}
