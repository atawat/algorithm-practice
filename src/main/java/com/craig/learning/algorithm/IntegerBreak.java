package com.craig.learning.algorithm;
/**
 * 整数拆分
 * https://leetcode.cn/problems/integer-break/
 */
public class IntegerBreak {

    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] =1;

        for (int i = 2; i < dp.length; i++) {
            int j = 1;
            if(i != dp.length -1){
                dp[i] = i;
            }     
            while(j <= i/2){
                dp[i] = Math.max(dp[j] * dp[i - j], dp[i]);
                j++;
            }
        }

        return dp[n];
    }
}
