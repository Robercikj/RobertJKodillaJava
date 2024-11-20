package com.kodilla.kodillastream;

import com.kodilla.kodillastream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier goBeauty = new PoemBeautifier();

        goBeauty.beautify("Kodilla", text -> "ABC" + text + "ABC");
        goBeauty.beautify("Kodilla", text -> "!!! " + text + " !!!");
        goBeauty.beautify("Kodilla", text -> text.toUpperCase());
        goBeauty.beautify("Kodilla", text -> new StringBuilder(text).reverse().toString());
        goBeauty.beautify("Kodilla", text -> "**".repeat(5) + text + ">".repeat(10));
        goBeauty.beautify("Kodilla", text -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i <text.length() ; i++) {
                char c = text.charAt(i);
                if(i % 2 == 0){
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }

            }
            return result.toString();
        });

    }
}
