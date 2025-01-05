package com.kodilla.kodillaspringintro;

import com.kodilla.kodillaspringintro.shape.Circle;
import com.kodilla.kodillaspringintro.shape.Drawer;
import com.kodilla.kodillaspringintro.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DrawerTestSuite {

    @Test
    void testDoDrawingWithCircle() {
        Circle circle = new Circle();

        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        assertEquals("This is Cricle", result);
    }
    @Test
    void testDoDrawingWithTriangle() {

        Triangle triangle = new Triangle();

        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        assertEquals("This is Triangle", result);
    }

}
