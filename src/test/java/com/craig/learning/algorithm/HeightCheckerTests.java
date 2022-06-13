package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HeightCheckerTests {
    HeightChecker solution = new HeightChecker();
    @Test
    void testHeightChecker() {
        int[] s = new int[] { 3, 2, 1, 4, 5, 6, 9, 7, 8 };
        assertEquals(5, solution.heightChecker(s));
    }
}
