package com.kodilla.stream;

import com.kodilla.stream.portfolio.StringReverser;

public class StreamMain {
    public static void main(String[] args) {

        String input = "Adam";
        String input2 = "Ewa";
        String input3 = "Kajak";
        StringReverser reverser = new StringReverser();

        System.out.println("Lustrzane odbicie '" + input + "' -> " + reverser.reverseString(input));
        System.out.println("Lustrzane odbicie '" + input2 + "' -> " + reverser.reverseString(input2));
        System.out.println("Lustrzane odbicie '" + input3 + "' -> " + reverser.reverseString(input3));


    }
}


