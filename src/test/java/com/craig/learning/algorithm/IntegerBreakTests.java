package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerBreakTests {
    IntegerBreak solution = new IntegerBreak();

    @Test
    void testIntegerBreak() {
        assertEquals(36, solution.integerBreak(10)); 
    }
}
