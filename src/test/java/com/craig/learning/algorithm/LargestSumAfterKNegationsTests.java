package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LargestSumAfterKNegationsTests {
    LargestSumAfterKNegations solution = new LargestSumAfterKNegations();

    @Test
    void LargestSumAfterKNegationsTest1(){
        assertEquals(5, solution.largestSumAfterKNegations(new int[]{2,3,4}, 1)); 
    }
}
