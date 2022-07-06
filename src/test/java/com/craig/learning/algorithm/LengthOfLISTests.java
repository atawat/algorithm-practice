package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LengthOfLISTests {
    LengthOfLIS solution = new LengthOfLIS();

    @Test
    void testLengthOfLIS() {
       assertEquals(4, solution.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18})); 
    }

    @Test
    void testLengthOfLIS1() {
       assertEquals(4, solution.lengthOfLIS(new int[]{0,1,0,3,2,3})); 
    }

    @Test
    void testLengthOfLIS2() {
       assertEquals(1, solution.lengthOfLIS(new int[]{7,7,7,7,7,7})); 
    }

    @Test
    void testLengthOfLIS3() {
       assertEquals(3, solution.lengthOfLIS(new int[]{4,10,4,3,8,9})); 
    }
}
