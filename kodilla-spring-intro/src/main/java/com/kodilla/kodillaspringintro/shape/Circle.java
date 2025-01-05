package com.kodilla.kodillaspringintro.shape;

public class Circle implements Shape {

    @Override
    public String draw() {
        System.out.println(" Drawing Circle");
        return "Drawing Circle";
    }

}
