package com.example;

import org.junit.jupiter.api.*;

public class LifecycleJUnit5Test {
    @BeforeAll
    static void setupAll() {
        System.out.println("Setup ALL TESTS");
    }

    @BeforeEach
    void setup(){
        System.out.println("Setup EACH TEST");
    }
    @Test
    void testOne(){
        System.out.println("TEST 1");
    }
    @Disabled
    @Test
    void testTwo(){
        System.out.println("TEST 2");
    }
    @AfterEach
    void teardown(){
        System.out.println("Teardown EACH TEST");
    }
    @AfterAll
    static void teardownAll(){
        System.out.println("Teardown ALL TESTS");
    }

}
