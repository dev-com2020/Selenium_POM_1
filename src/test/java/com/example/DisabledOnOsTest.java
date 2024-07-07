package com.example;

import org.junit.jupiter.api.Test;

import static com.example.Os.LINUX;
import static com.example.Os.WINDOWS;


public class DisabledOnOsTest {

    @DisabledOnOs({ WINDOWS,LINUX })
    @Test
    void conditionalTest(){
        System.out.println("Ten test będzie wyłączony na MAC i LINUX");
    }
}
