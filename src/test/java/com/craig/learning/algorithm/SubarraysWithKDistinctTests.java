package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubarraysWithKDistinctTests {
    SubarraysWithKDistinct solution = new SubarraysWithKDistinct();

    @Test
    void testSubarraysWithKDistinct() {
        assertEquals(7, solution.subarraysWithKDistinct(new int[]{1,2,1,2,3}, 2)); 
    }

    @Test
    void testSubarraysWithKDistinct2() {
        assertEquals(3, solution.subarraysWithKDistinct(new int[]{1,2,1,3,4}, 3)); 
    }
}
