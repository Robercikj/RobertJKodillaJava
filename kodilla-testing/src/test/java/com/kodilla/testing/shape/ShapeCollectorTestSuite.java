package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



@DisplayName("ShapeCollector Test Suite")
class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for adding and removing shapes")
    class AddRemoveTests {

        @Test
        @DisplayName("Should add a shape to the collection")
        void testAddFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(4);

            // When
            shapeCollector.addFigure(square);

            // Then
            assertEquals(1, shapeCollector.showFigures().split(", ").length);
            assertTrue(shapeCollector.showFigures().contains("Square"));
        }

        @Test
        @DisplayName("Should remove a shape from the collection")
        void testRemoveFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(4);
            shapeCollector.addFigure(square);

            // When
            boolean result = shapeCollector.removeFigure(square);

            // Then
            assertTrue(result);
            assertFalse(shapeCollector.showFigures().contains("Square"));
        }
    }

    @Nested
    @DisplayName("Tests for retrieving shapes")
    class RetrievalTests {

        @Test
        @DisplayName("Should return a shape at a given index")
        void testGetFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(4);
            Shape circle = new Circle(3);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);

            // When
            Shape result = shapeCollector.getFigure(1);

            // Then
            assertNotNull(result);
            assertEquals("Circle", result.getShapeName());
        }

        @Test
        @DisplayName("Should return null for an invalid index")
        void testGetFigureInvalidIndex() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();

            // When
            Shape result = shapeCollector.getFigure(5);

            // Then
            assertNull(result);
        }
    }

    @Nested
    @DisplayName("Tests for showing figures")
    class ShowFiguresTests {

        @Test
        @DisplayName("Should return all shape names as a single string")
        void testShowFigures() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(4);
            Shape circle = new Circle(3);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);

            // When
            String result = shapeCollector.showFigures();

            // Then
            assertEquals("Square, Circle", result);
        }

        @Test
        @DisplayName("Should return an empty string if no shapes are in the collection")
        void testShowFiguresEmpty() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();

            // When
            String result = shapeCollector.showFigures();

            // Then
            assertEquals("", result);
        }
    }
}
