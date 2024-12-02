package com.kodilla.stream.portfolio;

public class StringReverser {

    public String reverseString(String input) {
        return input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (reversed, character) -> character + reversed);
    }
}
