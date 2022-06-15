package com.craig.learning.algorithm;

/**
 * 对角线遍历
 * https://leetcode.cn/problems/diagonal-traverse/
 */
public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        int[][][] vetor = new int[][][] {
                new int[][] { new int[] { 0, 1 }, new int[] { 1, 0 } }, // → ↓
                new int[][] { new int[] { 1, -1 }, new int[] { -1, 1 } } // ↙ //↗
        };

        int n = mat.length; // 行
        int m = mat[0].length; // 列
        int[] result = new int[m * n];
        if(n==1){
            return mat[0];
        }
        if(m == 1){
            for (int i = 0; i < n; i++) {
                result[i] = mat[i][0];
            }
            return result;
        }

        int[] pivot = new int[] { -1, 0 };
        int diagonalSize = -1;
        int hSize =-1;

        int i = 0;
        int j = 0;
        int index = 0;
        while (i < n && j < m) {
            result[index++] = mat[i][j];
            if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                pivot[0] = (pivot[0] + 1) % 2;

                if (pivot[0] == 0) {
                    // 横向或纵向移动
                    int hIndex = (hSize + 1) % 2;
                    if ( i + vetor[pivot[0]][hIndex][0] < n && j+ vetor[pivot[0]][hIndex][1] < m) {
                        // 没有越界
                        pivot[1] = (++hSize % 2);
                    }
                } else {
                    pivot[1] = (++diagonalSize % 2);
                }
            }
            i += vetor[pivot[0]][pivot[1]][0];
            j += vetor[pivot[0]][pivot[1]][1];
        }
        return result;
    }
}
