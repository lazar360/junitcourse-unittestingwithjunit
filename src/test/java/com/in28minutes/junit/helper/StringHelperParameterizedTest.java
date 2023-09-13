package com.in28minutes.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    // AACD = > CD ACD => CD CDEF => CDEF CDAA => CDAA

    StringHelper helper = new StringHelper();

    private final String input;
    private final String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testCondition(){
    String[][] expectedOutputs = {
            {"AACD", "CD"},
            {"ACD", "CD"}
    };
        return Arrays.asList(expectedOutputs);
    }
    @org.junit.Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }
}
