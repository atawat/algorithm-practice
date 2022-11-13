package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class SmallestRangeTests {
    SmallestRange solution = new SmallestRange();

    @Test
    void testSmallestRange() {
        int[] range = solution
                .smallestRange(List.of(List.of(4, 10, 15, 24, 26), List.of(0, 9, 12, 20), List.of(5, 18, 22, 30)));
        assertArrayEquals(new int[] { 20, 24 }, range);
    }
}
