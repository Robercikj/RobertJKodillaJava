package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Number array is null or empty");
        }
        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
            .map(i -> numbers[i])
            .average()
                        .orElse(0.0);
    }
}
