package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CanPartitionTests {
    CanPartition solution = new CanPartition();
    @Test
    void testCanPartition() {
        assertTrue(solution.canPartition(new int[]{1,5,11,5}));
    }    
    
    @Test
    void testCanPartition1() {
        assertFalse(solution.canPartition(new int[]{9,5}));
    }
}
