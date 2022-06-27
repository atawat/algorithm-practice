package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxProfitWithFeeTests {
    MaxProfitWithFee solution = new MaxProfitWithFee();

    @Test
    void testMaxProfit() {
        assertEquals(8, solution.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2)); 
    }
}
