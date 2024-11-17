import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

import java.awt.*;

public class TestingMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(5, 5);

        System.out.println(circle.getShapeName() + " field"+ circle.getShapeName());
        System.out.println(square.getShapeName() + " field"+ square.getShapeName());
        System.out.println(triangle.getShapeName() + " field"+ triangle.getShapeName());
    }
}





