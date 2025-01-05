package com.kodilla.kodillaspringintro.shape;

import java.awt.*;

public class Triangle implements Shape {

    @Override
    public String draw() {
        System.out.println("Drawing Triangle");
        return "Drawin Triangle";
    }
}
