package com.craig.learning.algorithm;

/**
 * 最长回文子串
 * https://leetcode.cn/problems/longest-palindromic-substring/
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLength = 1;
        int maxI = 0;
        int maxJ = 0;

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
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
                    maxLength = Math.max(maxLength, l);
                    maxI = i;
                    maxJ = i + l - 1;
                }
            }
        }

        return s.substring(maxI, maxJ + 1);
    }
}
