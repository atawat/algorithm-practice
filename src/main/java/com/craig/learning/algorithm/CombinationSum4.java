package com.craig.learning.algorithm;

/**
 * 组合总和 Ⅳ
 * https://leetcode.cn/problems/combination-sum-iv/
 */
public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1]; //dp[i] 凑出i的数量
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i >= nums[j]){
                    dp[i] += dp[i-nums[j]];
                }
            }
        }

        return dp[target];
    }
}
