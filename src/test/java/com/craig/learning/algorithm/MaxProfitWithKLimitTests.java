package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxProfitWithKLimitTests {
    MaxProfit solution = new MaxProfit();

    @Test
    void maxProfitTest1(){
        assertEquals(2, solution.maxProfit(2, new int[]{2,4,1}));
    }
}
