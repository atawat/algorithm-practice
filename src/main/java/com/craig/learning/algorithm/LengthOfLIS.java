package com.craig.learning.algorithm;

/**
 * 最长递增子序列
 * https://leetcode.cn/problems/longest-increasing-subsequence/
 */
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length]; // dp[i] 已i结尾的最大递增序列长度
        dp[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > result){
                result = dp[i];
            }
        }

        return result;
    }
}
