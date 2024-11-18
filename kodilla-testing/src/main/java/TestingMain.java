import com.kodilla.testing.shape.*;
import com.kodilla.testing.shape.Shape;

import java.awt.*;

public class TestingMain {
    public static void main(String[] args) {
        ShapeCollector collector = new ShapeCollector();

        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(5, 5);

        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);

        System.out.println("Figures: " + collector.showFigures());
        System.out.println("Figure at index 1: " + collector.getFigure(1).getShapeName());
        collector.removeFigure(circle);
        System.out.println("Figures after removal: " + collector.showFigures());

        System.out.println(circle.getShapeName() + " field "+ circle.getShapeField());
        System.out.println(square.getShapeName() + " field "+ square.getShapeField());
        System.out.println(triangle.getShapeName() + " field "+ triangle.getShapeField());
    }
}





