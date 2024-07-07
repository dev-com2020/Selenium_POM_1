package com.example;


import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

interface TestInterfaceDynamicDemo {
    @TestFactory
    default Collection<DynamicTest> dynamicTestFromCollection() {
        return Arrays.asList(
                dynamicTest("1st dynamic test in test interface", ()->assertTrue(true)),
                dynamicTest("2nd dynamic test in test interface", ()->assertTrue(true))
        );
    }
}
