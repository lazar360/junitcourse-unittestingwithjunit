package com.in28minutes.junit.helper;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArraysCompareTest {

    @Test
    public void testArraySort_RandomArray(){
        int[] numbers = {12, 3, 4,1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }
    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray(){
        int[] numbers = null;
        Arrays.sort(numbers);
    }
}
