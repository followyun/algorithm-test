package com.my;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 */
public class SumOfThreeNumbersTest {
    @Test
    public void isIn() throws Exception {
        assertTrue(SumOfThreeNumbers.isIn(Arrays.asList(7,8,11, 7), 22));
        assertTrue(SumOfThreeNumbers.isIn(Arrays.asList(4,7,8,11, 7), 18));
        assertFalse(SumOfThreeNumbers.isIn(Arrays.asList(5,7,10, 9), 9));
    }

}