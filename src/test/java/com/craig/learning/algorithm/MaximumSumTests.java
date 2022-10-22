package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumSumTests {
    MaximumSum solution = new MaximumSum();
    @Test
    void testMaximumSum() {
        assertEquals(872, solution.maximumSum(new int[]{279,169,463,252,94,455,423,315,288,64,494,337,409,283,283,477,248,8,89,166,188,186,128}));
    }
}
