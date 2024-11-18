package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();
    public String addFigure(Shape shape){if(shape != null) shapes.add(shape);
        return shape.toString();}

    public boolean removeFigure(Shape shape){
        return shapes.remove(shape);
    }
    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }
    public String showFigures(){
        String names = "";
        for (Shape shape : shapes) {
            names += shape.getShapeName() + ", ";

        }
        if(!names.isEmpty()) {
            names = names.substring(0, names.length() - 2);
        }
        return names;

    }
}
