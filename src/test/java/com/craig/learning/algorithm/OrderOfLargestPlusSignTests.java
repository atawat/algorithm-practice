package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OrderOfLargestPlusSignTests {
    OrderOfLargestPlusSign solution = new OrderOfLargestPlusSign();

    @Test
    void testOrderOfLargestPlusSign() {
        assertEquals(2, solution.orderOfLargestPlusSign(5, new int[][] { new int[] { 4, 2 } }));
    }

    @Test
    void testOrderOfLargestPlusSign1() {
        assertEquals(0, solution.orderOfLargestPlusSign(1, new int[][] { new int[] { 0, 0 } }));
    }

    @Test
    void testOrderOfLargestPlusSign2() {
        assertEquals(1, solution.orderOfLargestPlusSign(2,
                new int[][] {
                        new int[] { 0, 0 },
                        new int[] { 0, 1 },
                        new int[] { 1, 0 }
                    }));
    }
}
