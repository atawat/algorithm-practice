package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RobTests {
    Rob solution = new Rob();

    @Test
    void testRob() {
        assertEquals(4, solution.rob(new int[]{1,2,3,1}));
    }    
    
    @Test
    void testRob1() {
        assertEquals(12, solution.rob(new int[]{2,7,9,3,1}));
    }
}
