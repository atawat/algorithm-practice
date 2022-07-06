package com.craig.learning.algorithm;

/**
 * 回文子串
 * https://leetcode.cn/problems/palindromic-substrings/
 */
public class CountSubstrings {

    public int countSubstrings(String s) {
        if (s.length() == 1) {
            return 1;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxCount = 0;


        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            maxCount++;
        }

        for (int l = 2; l <= s.length(); l++) {
            for (int i = 0; i <= s.length() - l; i++) {
                char a = s.charAt(i);
                char b = s.charAt(i + l - 1);
                if (l == 2) {
                    dp[i][i + l - 1] = a == b; //长度为2时直接对比a与b
                } else {
                    dp[i][i + l - 1] = a == b && dp[i + 1][i + l - 2]; //大于2时，看去掉两端是否是回文串
                }
                if (dp[i][i + l - 1]) {
                    maxCount++;
                }
            }
        }

        return maxCount;
    }
}
