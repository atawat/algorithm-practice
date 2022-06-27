package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinCostClimbingStairsTests {
    MinCostClimbingStairs solution = new MinCostClimbingStairs();

    @Test
    void testMinCostClimbingStairs() {
        assertEquals(10, solution.minCostClimbingStairs(new int[]{10,15}));
    }
}
