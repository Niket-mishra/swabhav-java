package com.aurionpro.model;

import java.awt.*;

public class ShapeClient {
    private IShape shapePrototype;
    public ShapeClient(IShape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }
    public IShape createShape() {
        return shapePrototype.clone();
    }
}
