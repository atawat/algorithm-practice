package com.craig.learning.algorithm;

/**
 * 两个字符串的删除操作
 * https://leetcode.cn/problems/delete-operation-for-two-strings/
 */
public class MinDistance {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 1; i <= word1.length(); i++) {
            char a = word1.charAt(i - 1);
            for (int j = 1; j <= word2.length(); j++) {
                char b = word2.charAt(j - 1);
                if (a == b) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int step = word1.length() - dp[word1.length()][word2.length()]
                + (word2.length() - dp[word1.length()][word2.length()]);

        return step;
    }
}
