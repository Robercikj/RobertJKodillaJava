package com.kodilla.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {
    @Test
    void testProbablyIWillThrowException() {
        SecondChallenge secondChallenge = new SecondChallenge();


        assertDoesNotThrow(() -> {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.0);
            assertEquals("Done!", result);
        });


        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.0));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 1.0));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
    }
}

