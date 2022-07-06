package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoinChangeTests {
    CoinChange solution = new CoinChange();
    @Test
    void testCoinChange() {
        assertEquals(3, solution.coinChange(new int[]{1,2,5}, 11)); 
    }
}
