package com.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.stream;

public class StreamExampleTest {

    @TestFactory
    Stream<DynamicTest> streamTest() {
        Integer array[] = {1, 2, 3, 4};
        Iterator<Integer> inputGenerator = Arrays.asList(array).iterator();

        Function<Integer, String> displayNameGenerator = (input) -> "Data input:" + input;

        ThrowingConsumer<Integer> testExecutor = (input) -> {
            System.out.println(input);
            assertTrue(input % 2 == 0);
        };
        return stream(inputGenerator, displayNameGenerator, testExecutor);

    }
}
