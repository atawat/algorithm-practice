package com.craig.learning.algorithm;

/**
 * 买卖股票的最佳时机 IV
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iv/
 */
public class MaxProfit {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) 
            return 0;
        int[][] dp = new int[prices.length][2 * k + 1]; // dp[i][j] 第i天持有的现金数量，j为奇数时候，为第N次买入（持有股票）的现金，偶数为卖出

        for (int i = 1; i <= 2 * k; i++) {
            if (i % 2 > 0) {
                dp[0][i] = -prices[0];
            }
        }

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = dp[i - 1][0];
            for (int j = 1; j <= 2 * k; j++) {
                if (j % 2 > 0) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] - prices[i], dp[i - 1][j]);
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + prices[i], dp[i - 1][j]);
                }
            }
        }

        return dp[prices.length - 1][2 * k];
    }
}
