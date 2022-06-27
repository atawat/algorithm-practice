package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindMinArrowShotsTests {
    FindMinArrowShots solution = new FindMinArrowShots();
    @Test
    void testFindMinArrowShots() {
        int[][] points = new int[][]{
            new int[]{10,16},
            new int[]{2,  8},
            new int[]{1,  6},
            new int[]{7, 12}
        };
        assertEquals(2, solution.findMinArrowShots(points));
    }

    @Test
    void testFindMinArrowShots2() {
        int[][] points = new int[][]{
            new int[]{1, 2},
            new int[]{1, 3},
            new int[]{1, 3},
            new int[]{1, 4},
            new int[]{3, 6},
            new int[]{5, 7},
            new int[]{9, 10}
        };
        assertEquals(3, solution.findMinArrowShots(points));
    }

    
    @Test
    void testFindMinArrowShots3() {
        int[][] points = new int[][]{
            new int[]{1, 10},
            new int[]{1, 3},
            new int[]{1, 3},
            new int[]{1, 4},
            new int[]{3, 6},
            new int[]{5, 7},
            new int[]{9, 10}
        };
        assertEquals(3, solution.findMinArrowShots(points));
    }

    @Test
    void testFindMinArrowShots4() {
        int[][] points = new int[][]{
            new int[]{1,2147483647},
        };
        assertEquals(1, solution.findMinArrowShots(points));
    }

    @Test
    void testFindMinArrowShots5() {
        int[][] points = new int[][]{
            new int[]{-2147483646,-2147483645},
            new int[]{2147483646,2147483647}
        };
        assertEquals(2, solution.findMinArrowShots(points));
    }
}
