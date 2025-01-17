package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

    @Override
    public java.lang.String getShapeName() {
        return "This is Circle !";
    }
}
