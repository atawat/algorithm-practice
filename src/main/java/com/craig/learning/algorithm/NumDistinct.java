package com.craig.learning.algorithm;

public class NumDistinct {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1]; // dp[i][j] 表示以1开始的字符串角标中，s中以i结尾的子序列 所包含的以j结尾的的子序列个数

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1; // 空串永远是一个子序列
        }

        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = 0; // 空串不足以构成t
        }

        for (int i = 1; i <= s.length(); i++) {
            char sC = s.charAt(i - 1);
            for (int j = 1; j <= t.length(); j++) {
                char sT = t.charAt(j - 1);

                if (sC == sT) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[s.length()][t.length()];
    }
}
