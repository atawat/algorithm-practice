package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MergeSortedArrayTests {
    MergeSortedArray solution = new MergeSortedArray();

    @Test
    void testMerge() {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = new int[] { 2, 5, 6 };
        int n = 3;
        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, nums1);
    }
    
    @Test
    void testMerge1() {
        int[] nums1 = new int[] { 0 };
        int m = 0;
        int[] nums2 = new int[] { 2 };
        int n = 1;
        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[] { 2 }, nums1);
    }
    
    @Test
    void testMerge2() {
        int[] nums1 = new int[] { 1 };
        int m = 1;
        int[] nums2 = new int[] {};
        int n = 0;
        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[] { 1 }, nums1);
    }
    
    @Test
    void testMerge3() {
        int[] nums1 = new int[] {2,0};
        int m = 1;
        int[] nums2 = new int[] {1};
        int n = 1;
        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[] {1,2}, nums1);
    }
}
