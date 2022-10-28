package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumSubarrayMinsTests {
    @Test
    void testSumSubarrayMins() {
        SumSubarrayMins solution = new SumSubarrayMins();
        assertEquals(444, solution.sumSubarrayMins(new int[] { 11, 81, 94, 43, 3 }));

        //assertEquals(17, solution.sumSubarrayMins(new int[] { 3,1,2,4}));
    }
}
