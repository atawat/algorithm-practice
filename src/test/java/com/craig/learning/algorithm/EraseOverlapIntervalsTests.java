package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EraseOverlapIntervalsTests {
    EraseOverlapIntervals solution = new EraseOverlapIntervals();

    @Test
    void testEraseOverlapIntervals() {
        int[][] interval = new int[][]{
            new int[]{1,100},
            new int[]{11,22},
            new int[]{1, 11},
            new int[]{2, 12}
        };
        assertEquals(2, solution.eraseOverlapIntervals(interval));
    }
}
