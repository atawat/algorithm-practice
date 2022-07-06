package com.craig.learning.algorithm;

/**
 * 最长重复子数组
 * https://leetcode.cn/problems/maximum-length-of-repeated-subarray/
 */
public class FindLength {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length]; // dp[i][j] 表示i之前与j之前的是否公共序列的长度
        dp[0][0] = nums1[0] == nums2[0] ? 1 : 0;
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = nums1[i] == nums2[0] ? 1 : 0;
            if (dp[i][0] == 1) {
                max = 1;
            }
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = nums1[0] == nums2[i] ? 1 : 0;
            if (dp[0][i] == 1) {
                max = 1;
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = nums1[i] == nums2[j] ? (1 + dp[i - 1][j - 1]) : 0;
                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }
}
