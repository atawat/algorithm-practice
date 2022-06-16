package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CombineTests {
    Combine solution = new Combine();
    @Test
    void testCombine() {
        List<List<Integer>> result = solution.combine(4, 3);
        assertEquals(4, result.size());
    }

    @Test
    void testCombine1() {
        List<List<Integer>> result = solution.combine(4, 2);
        assertEquals(6, result.size());
    }

    @Test
    void testCombine2() {
        List<List<Integer>> result = solution.combine(4, 1);
        assertEquals(4, result.size());
    }

    @Test
    void testCombine3() {
        List<List<Integer>> result = solution.combine(4, 4);
        assertEquals(1, result.size());
    }

    @Test
    void testCombine4() {
        List<List<Integer>> result = solution.combine(7, 4);
        assertEquals(35, result.size());
    }
}
