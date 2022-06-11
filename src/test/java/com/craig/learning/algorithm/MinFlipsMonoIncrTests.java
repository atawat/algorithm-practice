package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinFlipsMonoIncrTests {
    MinFlipsMonoIncr solution = new MinFlipsMonoIncr();
    @Test
    void testMinFlipsMonoIncr() {
        assertEquals(2, solution.minFlipsMonoIncr("00011000")); 
    }
}
