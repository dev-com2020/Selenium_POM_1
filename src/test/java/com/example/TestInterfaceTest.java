package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestInterfaceTest implements TestLifecycleLogger,TimeExecutionLogger,TestInterfaceDynamicDemo {
    @Test
    void isEqualValue() {
        assertEquals(1, 1);
    }
}
