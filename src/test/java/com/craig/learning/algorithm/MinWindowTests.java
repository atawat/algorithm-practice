package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinWindowTests {
    MinWindow solution = new MinWindow();

    @Test
    void testMinWindow() {
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";

        String result = solution.minWindow(s1, t1);
        assertEquals("BANC", result);
    }

    @Test
    void testMinWindow1() {
        String s1 = "ADOBECODEBANCX";
        String t1 = "X";

        String result = solution.minWindow(s1, t1);
        assertEquals("X", result);

    }

    @Test
    void testMinWindow2() {
        String s1 = "ADOBECODEBANC";
        String t1 = "ABBC";

        String result = solution.minWindow(s1, t1);
        assertEquals("BECODEBA", result);

    }
}
