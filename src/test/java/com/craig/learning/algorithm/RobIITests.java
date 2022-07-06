package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RobIITests {
    RobII solution = new RobII();

    @Test
    void testRob() {
        assertEquals(4, solution.rob(new int[]{1,2,3,1}));
    }

    @Test
    void testRob2() {
        assertEquals(3, solution.rob(new int[]{2,3,2}));
    }
}
