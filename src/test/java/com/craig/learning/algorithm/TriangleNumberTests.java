package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleNumberTests {
    TriangleNumber solution = new TriangleNumber();

    // @Test
    // void testBinarySearch() {
    //     assertEquals(5, solution.binarySearch(new int[] { 1, 2, 5, 7, 9, 10 }, 0, 5, 10));

    //     assertEquals(3, solution.binarySearch(new int[] { 1, 2, 5, 7, 9, 10 }, 0, 5, 8));

    //     assertEquals(1, solution.binarySearch(new int[] { 1, 2, 5, 7, 9, 10 }, 0, 5, 3));

    //     assertEquals(0, solution.binarySearch(new int[] { 1, 2, 5, 7, 9, 10 }, 0, 5, 0));
    // }

    @Test
    void testTriangleNumber() {
        assertEquals(3, solution.triangleNumber(new int[] { 2, 2, 3, 4 }));
    }

    @Test
    void testTriangleNumber2() {
        assertEquals(4, solution.triangleNumber(new int[] { 4,2,3,4 }));
    }
}
