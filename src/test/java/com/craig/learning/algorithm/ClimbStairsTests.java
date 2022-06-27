package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClimbStairsTests {
    ClimbStairs solution = new ClimbStairs();

    @Test
    void testClimbStairs() {
        assertEquals(5, solution.climbStairs(4)); 
    }
}
