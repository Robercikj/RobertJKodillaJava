package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestForCalculator {

    @Autowired
    Calculator calculator;

    @Test
    void CalculationTest(){
        //adding
        assertEquals(8, calculator.add(5,3));
        //substracting
        assertEquals(8, calculator.subtract(9,1));
        //multiply
        assertEquals(36, calculator.multiply(12,3));
        //dividing
        assertEquals(4, calculator.divide(12,3));

    }

}
