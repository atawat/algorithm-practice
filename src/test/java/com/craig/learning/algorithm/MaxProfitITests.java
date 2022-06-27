package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxProfitITests {
    MaxProfitI solution = new MaxProfitI();
    @Test
    void maxProfitITest1(){
        assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void maxProfitITest2(){
        assertEquals(1, solution.maxProfit(new int[]{1, 2}));
    }
}
