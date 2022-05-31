package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class GenerateMatrixTests {
    GenerateMatrix solution = new GenerateMatrix();

    @Test
    void testGenerateMatrix() {
        int n = 5;
        int[][] result = new int[][]{
            { 1, 2, 3, 4,5},
            {16,17,18,19,6},
            {15,24,25,20,7},
            {14,23,22,21,8},
            {13,12,11,10,9}
        };

        assertArrayEquals(result, solution.generateMatrix(n));
    }


    @Test
    void testGenerateMatrix1() {
        int n = 4;
        int[][] result = new int[][]{
            { 1, 2, 3, 4},
            {12,13,14, 5},
            {11,16,15, 6},
            {10, 9, 8, 7}
        };

        assertArrayEquals(result, solution.generateMatrix(n));
    }

    @Test
    void testGenerateMatrix2() {
        int n = 3;
        int[][] result = new int[][]{
            {1,2,3},
            {8,9,4},
            {7,6,5}
        };

        assertArrayEquals(result, solution.generateMatrix(n));
    }
}
