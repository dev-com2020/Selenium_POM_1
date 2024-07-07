package com.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("non-functional")
public class FunctionalTest {
    @Test
    void testOne(){
        System.out.println("Funkcjonalny Test 1");
    }
    @Test
    void testTwo(){
        System.out.println("Funkcjonalny Test 2");
    }
}
