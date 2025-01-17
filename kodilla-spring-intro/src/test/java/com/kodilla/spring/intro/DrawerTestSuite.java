package com.kodilla.spring.intro;

import com.kodilla.spring.intro.shape.Circle;
import com.kodilla.spring.intro.shape.Drawer;
import com.kodilla.spring.intro.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest


class DrawerTestSuite {

    @Test
    void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();

        //When
        Drawer drawer = new Drawer(circle);
        String result = circle.draw();

        //Then
        assertEquals("This is a circle!!!!!!!", result);
    }
    @Test
    void testDoDrawingWithTriangle() {
        Triangle triangle = new Triangle();

        Drawer drawer = new Drawer(triangle);
        String result = triangle.draw();

        assertEquals("This is a triangle!!!!!", result);
    }
}


