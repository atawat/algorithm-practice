package com.craig.learning.algorithm;

/**
 * 将字符串翻转到单调递增
 * https://leetcode.cn/problems/flip-string-to-monotone-increasing/
 */
public class MinFlipsMonoIncr {
    public int minFlipsMonoIncr(String s) {
        int[][] dp = new int[s.length() + 1][2];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            dp[i + 1][0] = (c == '1' ? 1 : 0) + dp[i][0];
            dp[i + 1][1] = (c == '0' ? 1 : 0) + Math.min(dp[i][0], dp[i][1]);
        }

        return Math.min(dp[s.length()][0], dp[s.length()][1]);
    }

    //优化空间
    public int minFlipsMonoIncr2(String s) {
        int dp0 = 0;
        int dp1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int oldDp0 = dp0;
            int oldDp1 = dp1;
            dp0 = (c == '1' ? 1 : 0) + dp0;
            dp1 = (c == '0' ? 1 : 0) + Math.min(oldDp0, oldDp1);
        }

        return Math.min(dp0, dp1);
    }
}
