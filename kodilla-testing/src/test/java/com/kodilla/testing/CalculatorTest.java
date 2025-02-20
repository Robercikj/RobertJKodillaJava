package com.kodilla.testing;

import com.kodilla.testing.calc.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void test() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1,2);
        assertEquals(result, 3, "Wynik działania");

        System.out.println("went good ");
    }
}
