package com.kodilla.testing.forum.collections;

import com.kodilla.testing.collections.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Before run testing");}
    @AfterEach
    public void after(){
        System.out.println("After run testing");}

    @Test
    @DisplayName("Test for empty list")


    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator o = new OddNumbersExterminator();

        List<Integer> emptyList = new ArrayList<>();

        List<Integer> result = o.exterminate(emptyList);

        Assertions.assertTrue(result.isEmpty(), "Powinna być pusta");
        System.out.println(emptyList);


    }

    @Test
    @DisplayName("Test for normal list")
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator o = new OddNumbersExterminator();
        List<Integer> oddList = List.of(1,2,3,4,5,6);

        List<Integer> expectedNumbers = List.of(2,4,6);



        List<Integer> result = o.exterminate(oddList);


        Assertions.assertEquals(expectedNumbers, result);
        System.out.println(expectedNumbers);
    }
}

