package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindKthLargestTests {
    FindKthLargest solution = new FindKthLargest();
    @Test
    void testFindKthLargest() {
        assertEquals(5, solution.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); 
    }

    @Test
    void testFindKthLargest2() {
        assertEquals(0, solution.findKthLargest(new int[]{-1,2,0}, 2)); 
    }
}
