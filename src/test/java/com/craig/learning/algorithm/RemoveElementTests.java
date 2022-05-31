package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveElementTests {
    @Test
    void testRemoveElement() {
        RemoveElement solution = new RemoveElement();
        // int[] nums1 = new int[]{3,2,2,3};
        // int val = 3;
        // int length =  solution.removeElement(nums1, val);
        // assertResult(new int[]{2,2}, nums1, 2, length);

        int[] nums2 = new int[]{0,1,2,2,3,0,4,2};
        int val2 = 2;
        int length2 = solution.removeElement2(nums2, val2);
        assertResult(new int[]{0,1,3,0,4}, nums2, 5, length2);
    }

    private void assertResult(int[] expectArray, int[] resultArray, int expectLength, int actualLength ){
        assertEquals(expectLength, actualLength);
        int[] subReusltArray = new int[actualLength];
        for(int i = 0;i< actualLength;i++){
            subReusltArray[i] = resultArray[i];
        }
        assertArrayEquals(expectArray, subReusltArray);
    }
}
