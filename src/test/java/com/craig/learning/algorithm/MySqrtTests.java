package com.craig.learning.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySqrtTests {
    MySqrt solution = new MySqrt();

    @Test
    void testMySqrt() {
        assertEquals(2, solution.mySqrt(4));
    }

    @Test
    void testMySqrt2() {
        assertEquals(2, solution.mySqrt(8));
    }

    @Test
    void testMySqrt3() {
        assertEquals(46340, solution.mySqrt(Integer.MAX_VALUE));
    }
}
