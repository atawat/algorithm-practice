package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShortestSubarrayTests {
    @Test
    void ShortestSubarrayTest1() {
        ShortestSubarray solution = new ShortestSubarray();
        int[] input = new int[] { 2, -1, 2 };
        int k = 3;
        assertEquals(3, solution.shortestSubarray(input, k));
    }
}
