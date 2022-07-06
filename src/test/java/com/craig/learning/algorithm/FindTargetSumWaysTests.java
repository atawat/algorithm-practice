package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindTargetSumWaysTests {
    FindTargetSumWays solution = new FindTargetSumWays();
    @Test
    void testFindTargetSumWays() {
        assertEquals(2, solution.findTargetSumWays(new int[]{1,0}, 1));
    }    
    
    @Test
    void testFindTargetSumWays2() {
        assertEquals(2, solution.findTargetSumWays(new int[]{1,1}, 0));
    }
}
