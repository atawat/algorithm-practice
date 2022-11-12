package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MaxSumOfThreeSubarraysTests {
    MaxSumOfThreeSubarrays solution = new MaxSumOfThreeSubarrays();

    @Test
    void testMaxSumOfThreeSubarrays() {
        int[] result = solution.maxSumOfThreeSubarrays(new int[] { 1, 2, 1, 2, 6, 7, 5, 1 }, 2);

        assertArrayEquals(new int[] { 0, 3, 5 }, result);
    }

    @Test
    void testMaxSumOfThreeSubarrays2() {
        int[] result = solution.maxSumOfThreeSubarrays(new int[] { 4, 5, 10, 6, 11, 17, 4, 11, 1, 3 }, 1);

        assertArrayEquals(new int[]{4,5,7}, result); 
    }
}
