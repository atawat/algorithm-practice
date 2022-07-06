package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RotateTests {
    Rotate solution = new Rotate();

    @Test
    void testRotate() {
        int[][] matrix = new int[][]{
            new int[]{1,2,3,4},
            new int[]{5,6,7,8},
            new int[]{9,10,11,12},
            new int[]{13,14,15,16},
        };
        solution.rotate(matrix);
        int[][] expected = new int[][]{
            new int[]{13,9,5,1},
            new int[]{14, 10,  6 , 2},
            new int[]{15, 11,  7, 3},
            new int[]{16,12,8,4}
        };
        assertArrayEquals(expected, matrix);
    }
}
