package com.kodilla.kodilla.exception.test;

public class ExceptionHandling {

    public void handleException() {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.0);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Exception caught: " + e);
        } finally {
            System.out.println("Execution finished.");
        }
    }
}
