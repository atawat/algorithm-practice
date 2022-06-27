package com.craig.learning.algorithm;

import java.util.Arrays;

/**
 * 分割等和子集
 * https://leetcode.cn/problems/partition-equal-subset-sum/
 */
public class CanPartition {
    public boolean canPartition(int[] nums) {
        if(nums.length == 1){
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        }

        int capacity = sum /2;
        if (maxNum > capacity) {
            return false;
        }

        boolean[][] dp = new boolean[nums.length][capacity+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

        dp[0][nums[0]] = true;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <= capacity; j++) {
                if(j < nums[i]){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
                }
                
            }
        }

        return dp[nums.length-1][capacity];
    }
}
