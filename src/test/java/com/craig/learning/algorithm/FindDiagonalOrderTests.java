package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class FindDiagonalOrderTests {
    FindDiagonalOrder solution = new FindDiagonalOrder();

    @Test
    void testFindDiagonalOrder() {
        int[][] matrix = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        assertArrayEquals(new int[] { 1, 2, 4, 7, 5, 3, 6, 8, 9 }, solution.findDiagonalOrder(matrix));
    }

    @Test
    void testFindDiagonalOrder2() {
        int[][] matrix = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        assertArrayEquals(new int[] { 1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12 }, solution.findDiagonalOrder(matrix));
    }

    @Test
    void testFindDiagonalOrder3() {
        int[][] matrix = new int[][] {
                { 1, 2 },
                { 3, 4 }
        };

        assertArrayEquals(new int[] { 1, 2, 3, 4 }, solution.findDiagonalOrder(matrix));
    }

    @Test
    void testFindDiagonalOrder4() {
        int[][] matrix = new int[][] {
                { 1, 2 , 3,4}
        };

        assertArrayEquals(new int[] { 1, 2,3,4}, solution.findDiagonalOrder(matrix));
    }

    @Test
    void testFindDiagonalOrder5() {
        int[][] matrix = new int[][] {
                { 1 },
                { 2 },
                { 3 }
        };

        assertArrayEquals(new int[] { 1, 2, 3 }, solution.findDiagonalOrder(matrix));
    }

    @Test
    void testFindDiagonalOrder6() {
        int[][] matrix = new int[][] {
                { 1,   2,  3,  4,  5 },
                { 6,   7,  8,  9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        assertArrayEquals(new int[] { 1, 2,6,11,7,3,4,8,12,16,21,17,13,9,5,10,14,18,22,23,19,15,20,24,25 }, solution.findDiagonalOrder(matrix));
    }
}
