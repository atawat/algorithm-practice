package com.craig.learning.algorithm;

/**
 * 最长回文子序列
 * https://leetcode.cn/problems/longest-palindromic-subsequence/
 */
public class LongestPalindromeSubseq {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];  //S(i)到S(j)之间的最大回文串长度
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }

        for (int i = dp.length-1; i >= 0; i--) {
            for (int j = i+1; j < dp[0].length; j++) {
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] + 2;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
                }
            }
        }

        return dp[0][s.length() -1];
    }
}
