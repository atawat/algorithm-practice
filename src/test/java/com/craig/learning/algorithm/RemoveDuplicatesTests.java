package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTests {
    @Test
    void testRemoveDuplicates() {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = new int[]{0,0,1,2,2,2,3,4};
        int length = solution.removeDuplicates(nums);

        int[] subReusltArray = new int[length];
        for(int i = 0;i< length;i++){
            subReusltArray[i] = nums[i];
        }

        assertArrayEquals(new int[]{0,1,2,3,4}, subReusltArray);
    }
}
