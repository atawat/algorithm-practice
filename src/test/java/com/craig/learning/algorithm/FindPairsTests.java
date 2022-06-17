package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindPairsTests {
    FindPairs solution = new FindPairs();

    @Test
    void testFindPairs() {
        assertEquals(4, solution.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    } 

    @Test
    void testFindPairs1() {
        assertEquals(2, solution.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    } 

    @Test
    void testFindPairs2() {
        assertEquals(1, solution.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    } 

    @Test
    void testFindPairs3() {
        assertEquals(0, solution.findPairs(new int[]{1, 3, 1, 5, 4}, 5));
    }   

    @Test
    void testFindPairs4() {
        assertEquals(2, solution.findPairs(new int[]{-1,-2,-3}, 1));
    }   
}
