package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindNthDigitTests {
    FindNthDigit solution = new FindNthDigit();
    @Test
    void testFindNthDigit() {
        assertEquals(0, solution.findNthDigit(11));
        assertEquals(1, solution.findNthDigit(12));
        assertEquals(1, solution.findNthDigit(13));
    }

    @Test
    void testFindNthDigit1() {
        assertEquals(2, solution.findNthDigit(Integer.MAX_VALUE));
    }

    @Test
    void testFindNthDigit2() {
        assertEquals(0, solution.findNthDigit(200));
    }


    @Test
    void testFindNthDigit3() {
        assertEquals(9, solution.findNthDigit(788888889));
    }
}
