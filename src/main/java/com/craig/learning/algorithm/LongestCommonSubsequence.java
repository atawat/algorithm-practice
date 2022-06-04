package com.craig.learning.algorithm;

/**
 * 最长公共子序列
 * https://leetcode.cn/problems/longest-common-subsequence/
 */
public class LongestCommonSubsequence {
    /**
     * 最长公共子序列（动态规划解法）
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] z = new int[text1.length() + 1][text2.length() + 1]; // 子问题最优解数组，Z[i][j] 意味子串text1(1...i) 与
                                                                     // text2(1...j)的最大LCS(Longest Common Subsequence)长度
                                                                     // 角标0代表没有这个子串
        for (int i = 1; i < text1.length() + 1; i++) {
            for (int j = 1; j < text2.length() + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    z[i][j] = z[i - 1][j - 1] + 1;                  //text1[i] == text2[j] 时候，其LCS是 其两个串去掉i与j位置子串的 LCS长度 +1
                } else if (z[i - 1][j] >= z[i][j - 1]) {
                    z[i][j] = z[i - 1][j];                          //text1[i] i= text2[j] 时，其LCS是  max{text1(1...i-1) 与 text2(1...j) 的LCS长度，text1(1...i) 与 text2(1...j-1) 的LCS长度}
                } else {
                    z[i][j] = z[i][j - 1];
                }
            }
        }

        return z[text1.length()][text2.length()];
    }
}
