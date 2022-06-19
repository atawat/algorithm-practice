package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrapTests {
    Trap solution = new Trap();

    @Test
    void testTrap() {
        assertEquals(6, solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    @Test
    void testTrap2() {
        assertEquals(9, solution.trap(new int[]{4,2,0,3,2,5}));
    }
}
