package com.kodilla.kodillastream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator decorator) {
        String result = decorator.decorate(text);
        System.out.println("result after beauty: " + result );

    }
}
