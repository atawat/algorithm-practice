package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinSubArrayLenTests {
    MinSubArrayLen solution = new MinSubArrayLen();
    
    @Test
    void minSubArrayLen() {
        
        int[] test1 = new int[]{2,3,1,2,4,3};
        int result = solution.minSubArrayLen2(7,test1);
        assertEquals(2, result);
    }

    @Test
    public void testCase2() {
        int[] test2 = new int[]{1,2,3,4,5};
        int result2 = solution.minSubArrayLen2(11,test2);
        assertEquals(3, result2);
    }

    @Test
    public void testCase3(){
        int[] test3 = new int[]{1,4,4};
        int result3 = solution.minSubArrayLen2(4,test3);
        assertEquals(1, result3);
    }

    @Test
    public void testCase4(){
        int[] test = new int[]{1,2,3,4,5};
        int result = solution.minSubArrayLen2(15, test);
        assertEquals(5, result);
    }
}
