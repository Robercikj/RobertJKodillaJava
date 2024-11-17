package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double footing;
    private double height;

    public Triangle(double footing, double height) {
        this.footing = footing;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public Double getShapeField() {
        return (footing*height)/2;
    }
}
