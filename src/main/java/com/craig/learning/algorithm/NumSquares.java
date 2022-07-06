package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/perfect-squares/
 * 完全平方数
 */
public class NumSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];  //dp[i] 为凑够整数i所需要的最少完全平方数
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j*j <= i; j++) {  // j*j < n 巧妙的，所有平方数的遍历
                dp[i] = Math.min(dp[i], dp[i - j*j]+1);
            }
        }

        return dp[n];
    }
}
