package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindLengthOfLCISTests {
    FindLengthOfLCIS solution = new FindLengthOfLCIS();

    @Test
    void testFindLengthOfLCIS() {
        assertEquals(3, solution.findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }

    @Test
    void testFindLengthOfLCIS1() {
        assertEquals(1, solution.findLengthOfLCIS(new int[]{2,2,2,2,2}));
    }

    @Test
    void testFindLengthOfLCIS2() {
        assertEquals(4, solution.findLengthOfLCIS(new int[]{1,2,3,4}));
    }
}
