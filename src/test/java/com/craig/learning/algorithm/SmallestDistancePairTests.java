package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmallestDistancePairTests {
    SmallestDistancePair solution = new SmallestDistancePair();
    
    @Test
    void testSmallestDistancePair() {
        assertEquals(0, solution.smallestDistancePair(new int[]{1,1,1}, 2)); 
    }
}
