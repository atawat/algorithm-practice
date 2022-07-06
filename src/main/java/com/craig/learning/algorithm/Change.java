package com.craig.learning.algorithm;

/**
 * 零钱兑换 II
 * https://leetcode.cn/problems/coin-change-2/
 */
public class Change {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1]; //完全背包，dp[i] 凑够金额I的组合数量
        dp[0] = 1;  //金额0就是不凑，是一种

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j-coins[i]];
            }
        }

        return dp[amount];
    }
}
