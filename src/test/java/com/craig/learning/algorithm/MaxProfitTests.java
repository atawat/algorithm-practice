package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxProfitTests {
    MaxProfitII solution = new MaxProfitII();
    @Test
    void testMaxProfit() {
        assertEquals(7, solution.maxProfit(new int[]{7,1,5,3,6,4})); 
    }
}
