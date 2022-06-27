package com.craig.learning.algorithm;

/**
 *  买卖股票的最佳时机
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
 */
public class MaxProfitI {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int[] profit = new int[prices.length -1];
        
        for (int i = 1; i < prices.length; i++) {
            profit[i-1] = prices[i] - prices[i-1];  //隔日利润
        }

        int[] max = new int[profit.length];
        max[0] = profit[0];
        int maxProfit = profit[0];
        for (int i = 1; i < profit.length; i++) {
            max[i] = Math.max(max[i-1] + profit[i], profit[i]);
            maxProfit = Math.max(max[i], maxProfit);
        }

        

        return maxProfit > 0 ? maxProfit : 0;
    }
}
