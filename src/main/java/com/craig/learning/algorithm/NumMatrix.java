package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/range-sum-query-2d-immutable/solution/
 * 304. 二维区域和检索 - 矩阵不可变
 */
public class NumMatrix {

    private int[][] preSum;

    public NumMatrix(int[][] matrix) {
        preSum = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    preSum[i][j] = matrix[i][j];
                } else if (i == 0) {
                    preSum[i][j] = preSum[i][j - 1] + matrix[i][j];
                } else if (j == 0) {
                    preSum[i][j] = preSum[i - 1][j] + matrix[i][j];
                } else {
                    preSum[i][j] = preSum[i][j - 1] + preSum[i - 1][j] - preSum[i - 1][j - 1] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 == 0 && col1 == 0) {
            return preSum[row2][col2];
        }
        if (row1 == 0) {
            return preSum[row2][col2] - preSum[row2][col1 - 1];
        }
        if (col1 == 0) {
            return preSum[row2][col2] - preSum[row1 -1][col2];
        }
        return preSum[row2][col2] - preSum[row1 - 1][col2] - preSum[row2][col1 - 1] + preSum[row1 - 1][col1 - 1];
    }
}
