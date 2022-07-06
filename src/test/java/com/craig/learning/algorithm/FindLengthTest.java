package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindLengthTest {
    FindLength solution = new FindLength();

    @Test
    void findLengthTest() {
        assertEquals(3, solution.findLength(new int[] { 1, 2, 3, 2, 1 }, new int[] { 3, 2, 1, 4, 7 }));
    }

    @Test
    void findLengthTest1() {
        assertEquals(4, solution.findLength(new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 0, 4, 5, 6, 7, 1, 2, 3 }));
    }

    @Test
    void findLengthTest2() {
        assertEquals(2, solution.findLength(new int[] { 0, 1, 1, 1, 1 }, new int[] { 1, 0, 1, 0, 1 }));
    }

    @Test
    void findLengthTest3() {
        assertEquals(3, solution.findLength(new int[] { 1, 2, 3, 2, 1 }, new int[] { 3, 2, 1, 4 }));
    }

    @Test
    void findLengthTest4() {
        assertEquals(1, solution.findLength(new int[] { 1, 2, 3, 2, 8 }, new int[] { 5,6,1,4,7 }));
    }
}
