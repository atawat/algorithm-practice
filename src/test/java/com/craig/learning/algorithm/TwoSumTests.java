package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTests {
    TwoSum solution = new TwoSum();

    @Test
    void testTwoSum() {
        int[] nums = new int[] { 3, 3 };
        int target = 6;
        assertArrayEquals(new int[]{0,1}, solution.twoSum(nums, target)); 
    }

    @Test
    void testTwoSum1() {
        int[] nums = new int[] { 3, 2,4 };
        int target = 6;
        assertArrayEquals(new int[]{1,2}, solution.twoSum(nums, target)); 
    }
}
