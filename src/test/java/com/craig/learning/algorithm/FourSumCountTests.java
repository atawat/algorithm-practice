package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FourSumCountTests {
    FourSumCount solution = new FourSumCount();

    @Test
    void testFourSumCount() {
        int[] nums1 = new int[] { 1, 2 };
        int[] nums2 = new int[] { -2, -1 };
        int[] nums3 = new int[] { -1, 2 };
        int[] nums4 = new int[] { 0, 2 };

        int target = solution.fourSumCount(nums1, nums2, nums3, nums4);
        assertEquals(2, target);
    }
}
