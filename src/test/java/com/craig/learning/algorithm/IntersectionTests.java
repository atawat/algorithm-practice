package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class IntersectionTests {
    Intersection solution = new Intersection();

    @Test
    public void intersectionTest(){
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        int[] result = solution.intersection(nums1, nums2);
        int[] expect = new int[]{4,9};

        assertArrayEquals(expect, result);
    }

    @Test
    public void intersectionDuplicateTest(){
        int[] nums1 = new int[]{1,2,2,1,3,3};
        int[] nums2 = new int[]{1,2,2,3,3,3};

        int[] result = solution.intersectionWithDuplicate(nums1, nums2);
        int[] expect = new int[]{1,2,2,3,3};

        assertArrayEquals(expect, result);
    }
}
