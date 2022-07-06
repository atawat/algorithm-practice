package com.craig.learning.algorithm;

/**
 * 最佳买卖股票时机含冷冻期
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class MaxProfitWithFreeze {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3]; // dp[i][j] 0持有股票，1不持有股票且处于冻结期，2不持有股票且不处于冻结期
        dp[0][0] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][2] - prices[i], dp[i - 1][0]);
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
        }

        return Math.max(dp[prices.length - 1][1], dp[prices.length - 1][2]);
    }
}
