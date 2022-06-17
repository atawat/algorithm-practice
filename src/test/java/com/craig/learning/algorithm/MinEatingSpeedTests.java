package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinEatingSpeedTests {
    MinEatingSpeed solution = new MinEatingSpeed();
    @Test
    void testMinEatingSpeed() {
        assertEquals(4, solution.minEatingSpeed(new int[]{3,6,7,11}, 8)); 
    }
}
