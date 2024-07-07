package com.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutExceededTest {
    @Test
    void timeoutNotExceededWithResult() {
        String actualResult = assertTimeout(Duration.ofMinutes(1), () -> {
            return "cześć";
        });
        assertEquals("cześć", actualResult);
    }

    @Test
    void timeoutExceeded() {
        assertTimeout(Duration.ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    @Test
    void timeoutNotExceededWithMethod() {
        String actualGreeting = assertTimeout(Duration.ofMinutes(1),
                TimeoutExceededTest::greeting);
        assertEquals("hello JUnit5", actualGreeting);
    }

    private static String greeting(){
        return "hello JUnit5";
    }
}
