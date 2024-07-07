package com.example;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface TestLifecycleLogger {
    static final Logger log = LoggerFactory.getLogger(TestLifecycleLogger.class.getName());

    @BeforeAll
    static void beforeAllTests() {
        log.info("beforeAllTests");
    }

    @AfterAll
    static void afterAllTests() {
        log.info("afterAllTests");
    }
    @BeforeEach
    default void beforeEachTests(TestInfo testInfo) {
        log.info("About to execute {}", testInfo.getDisplayName());
    }

    @AfterEach
    default void afterEachTests(TestInfo testInfo) {
        log.info("Finished executing {}", testInfo.getDisplayName());
    }

}
