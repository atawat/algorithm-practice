package com.craig.learning.algorithm;

/**
 * 旋转图像
 * https://leetcode.cn/problems/rotate-image/
 */
public class Rotate {
    public void rotate(int[][] matrix) {
        int top = -1;
        int right = matrix.length;
        int bottom = matrix.length;
        int left = -1;
        int gap = 1;
        for (int n = matrix.length; n >= 1; n = n - 2) {
            int temp = 0;
            int temp2 = 0;
            top += gap;
            right -= gap;
            bottom -= gap;
            left += gap;
            for (int j = 0; j < right - left ; j++) {
                temp = matrix[top + j][right];
                matrix[top + j][right] = matrix[top][left + j];

                temp2 = matrix[bottom][right - j];
                matrix[bottom][right - j] = temp;
                temp = temp2;

                temp2 = matrix[bottom - j][left];
                matrix[bottom - j][left] = temp;
                temp = temp2;

                matrix[top][left + j] = temp;
            }
        }
    }
}
