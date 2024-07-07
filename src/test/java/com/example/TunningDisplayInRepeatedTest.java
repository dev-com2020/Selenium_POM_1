package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class TunningDisplayInRepeatedTest {

    @RepeatedTest(value = 2,name = "{displayName} {currentRepetition} / {totalRepetitions}")
    @DisplayName("Powtórka!")
    void customDisplayName(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }

    @RepeatedTest(value = 2,name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Test który używa long name")
    void customDisplayNameWithLongPattern(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }

    @RepeatedTest(value = 2,name = RepeatedTest.SHORT_DISPLAY_NAME)
    @DisplayName("Test który używa short name")
    void customDisplayNameWithShortPattern(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }
}
