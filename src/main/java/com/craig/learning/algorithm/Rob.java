package com.craig.learning.algorithm;

/**
 * 打家劫舍
 * https://leetcode.cn/problems/house-robber/
 */
public class Rob {
    public int rob(int[] nums) {
        // int[][] dp = new int[2][nums.length]; //i=0 不打 i=1 打
        // dp[0][0] = 0;
        // dp[1][0] = nums[0];

        int max0 = 0;
        int max1 = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // dp[0][i] = Math.max(dp[0][i-1], dp[1][i-1]);
            // dp[1][i] = dp[0][i-1] + nums[i]; //如果要打劫，则前一家不能打

            int newMax0 = Math.max(max0, max1);
            int newMax1 = max0 + nums[i];

            max0 = newMax0;
            max1 = newMax1;
        }

        return Math.max(max0, max1);
    }
}
