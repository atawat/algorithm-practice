package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SortedSquaresTests {
    @Test
    void testSortedSquares() {
        int[] test1 = new int[]{-7,-3,2,3,11};
        SortedSquares solution = new SortedSquares();
        int[] result = solution.sortedSquares(test1);
        assertArrayEquals(new int[]{4,9,9,49,121}, result);
    }
}
