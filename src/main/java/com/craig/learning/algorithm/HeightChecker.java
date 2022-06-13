package com.craig.learning.algorithm;

/**
 * 高度检查器
 * https://leetcode.cn/problems/height-checker/
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }

        int[] countMap = new int[max + 1];
        for (int i = 0; i < heights.length; i++) {
            countMap[heights[i]]++;
        }

        int total = 0;
        int diffCount = 0;
        for (int i = 0; i < countMap.length; i++) {
            if (countMap[i] == 0) {
                continue;
            }
            int order = countMap[i];
            for (int j = 0; j < order; j++) {
                if (heights[total + j] != i) {
                    diffCount++;
                }
            }
            total += order;
        }

        return diffCount;
    }
}
