package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MaxSlidingWindowTests {
    MaxSlidingWindow solution = new MaxSlidingWindow();

    @Test
    void testMaxSlidingWindow() {
       int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
       int k = 3;

       int[] result = solution.maxSlidingWindow(nums, k);
       assertArrayEquals(new int[]{3,3,5,5,6,7}, result);
    }

    @Test
    void testMaxSlidingWindow2() {
       int[] nums = new int[]{-1,1};
       int k = 1;

       int[] result = solution.maxSlidingWindow(nums, k);
       assertArrayEquals(new int[]{-1,1}, result);
    }
    
    @Test
    void testMaxSlidingWindow3() {
       int[] nums = new int[]{1,-1};
       int k = 1;

       int[] result = solution.maxSlidingWindow(nums, k);
       assertArrayEquals(new int[]{1,-1}, result);
    }    
    
    @Test
    void testMaxSlidingWindow4() {
       int[] nums = new int[]{9,10,9,-7,-4,-8,2,-6};
       int k = 5;

       int[] result = solution.maxSlidingWindow(nums, k);
       assertArrayEquals(new int[]{10,10,9,2}, result);
    }
}
