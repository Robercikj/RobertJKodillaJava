package com.kodilla.testing;

import com.kodilla.testing.Calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public String findVowels(String text) {
        String vowels = "aeiouAEIOU";
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(vowels.contains(String.valueOf(ch))) {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("Robert", "Jurek");
        String word = simpleUser.getUsername();








        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");
        TestingMain testingMain = new TestingMain();
        String onlyVowels = testingMain.findVowels("Adam");
        String onlyVowels2 = testingMain.findVowels("Antarktyda");
        System.out.println(onlyVowels2);
        System.out.println(onlyVowels);


        // add and substract
        Calculator calculator = new Calculator();
        int result =calculator.add(5,5);
        if(result == 10){
            System.out.println(" method add - OK");
        } else {
            System.out.println("add - ERROR");
        }
        int result1 = calculator.subtract(5,5);
        if (result1 == 0){
            System.out.println(" method subtract - OK");
        }else{
            System.out.println("subtract - ERROR");
        }
        System.out.println(result);
        System.out.println(result1);



    }
}
