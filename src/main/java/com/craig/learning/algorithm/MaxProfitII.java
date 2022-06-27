package com.craig.learning.algorithm;

/**
 * 买卖股票的最佳时机 II
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class MaxProfitII {
    public int maxProfit(int[] prices) {
        int max=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] - prices[i-1] > 0){
                max += (prices[i] - prices[i-1]);
            }
        }

        return max;
    }
}
