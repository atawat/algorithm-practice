package com.craig.learning.algorithm;

/**
 *  目标和
 * https://leetcode.cn/problems/target-sum/
 */
public class FindTargetSumWays {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        //设所有数字和为sum，正数部分和为left, 负数部分和为right, left - right = target , left = sum - right, ->  sum - right -right = target -> sum - 2*right = target -> (sum-target) /2 = right
        //既求left有几种组合

        
        if(sum - target <0 || (sum - target) % 2 >0){
            //right 要求非负偶数，非偶数说明有小数，凑不够
            return 0;
        }
        int right = (sum - target) /2;  
        int[][] dp = new int[nums.length+1][right+1]; //dp[i][j] 表示在前i个数中（角标从1开始），凑出和为j的方案数
        dp[0][0] = 1; //不需要凑，就是一种方案

        for (int i = 1; i < nums.length + 1; i++) {
            for (int j = 0; j <= right; j++) {
                if(nums[i-1] > j){
                    dp[i][j] = dp[i-1][j];  //数字比j还大不能放入方案
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]]; //要么放入，要么不放入，两种选择数量相交
                }
            }
        }

        return dp[nums.length][right];
    }

    // public int findTargetSumWays(int[] nums, int target) {
    //     int sum = 0;
    //     for (int num : nums) {
    //         sum += num;
    //     }
    //     int diff = sum - target;
    //     if (diff < 0 || diff % 2 != 0) {
    //         return 0;
    //     }
    //     int n = nums.length, neg = diff / 2;
    //     int[][] dp = new int[n + 1][neg + 1];
    //     dp[0][0] = 1;
    //     for (int i = 1; i <= n; i++) {
    //         int num = nums[i - 1];
    //         for (int j = 0; j <= neg; j++) {
    //             dp[i][j] = dp[i - 1][j];
    //             if (j >= num) {
    //                 dp[i][j] += dp[i - 1][j - num];
    //             }
    //         }
    //     }
    //     return dp[n][neg];
    // }
}
