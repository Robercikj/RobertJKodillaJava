package com.kodilla.kodilla.exception.test;



public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    public double exponentiation(double base, double exponent) throws ArithmeticException {
        if(exponent == 0) return 1;
        int result = 1;
        for(int i = 0;i < exponent; i++) {
            result *= base;
        }
return result;
    }


    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double resultExp = firstChallenge.exponentiation(5,5);
        System.out.println(resultExp);
        try{
            double result = firstChallenge.divide(3, 0);
            System.out.println("result of dividing" + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + e);
        } finally {
            System.out.println("dividing ended anyway");
        }


    }
}
