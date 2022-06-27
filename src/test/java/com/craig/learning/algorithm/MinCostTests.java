package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinCostTests {
    MinCost solution = new MinCost();

    @Test
    void testMinCost() {
        int[][] costs = new int[][]{
            new int[]{17,2,17},
            new int[]{16,16,5},
            new int[]{14,3,19}
        };

        assertEquals(10, solution.minCost(costs));
    }

    @Test
    void testMinCost1() {
        int[][] costs = new int[][]{
            new int[]{4,3,2},
            new int[]{6,5,4},
            new int[]{4,2,10}
        };

        assertEquals(9, solution.minCost(costs));
    }
}
