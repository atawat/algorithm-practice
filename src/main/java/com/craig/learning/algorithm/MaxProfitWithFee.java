package com.craig.learning.algorithm;

/**
 * 买卖股票的最佳时机含手续费
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 */
public class MaxProfitWithFee {
    public int maxProfit(int[] prices, int fee) {
        int minPrice = Integer.MAX_VALUE;
        int totalProfits =0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] <= minPrice){
                minPrice = prices[i];
                continue;
            }

            if(prices[i] - minPrice - fee <=0){
                continue;
            }

            totalProfits += prices[i] - minPrice - fee;
            minPrice = prices[i] - fee; //下一次走到这里，如果价格还是大于minprice，则前一天不卖，继续保持，把fee放入minPrice，下次继续加的时候则相当于没有扣除fee
        }

        return totalProfits;
    }
}
