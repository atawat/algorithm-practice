package com.craig.learning.algorithm;

/**
 * 不相交的线
 * https://leetcode.cn/problems/uncrossed-lines/
 */
public class MaxUncrossedLines {
    //就是 LCS问题
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][nums2.length+1];

        //角标从1开始
        for (int i = 1; i < nums1.length + 1; i++) {
            for (int j = 1; j < nums2.length + 1; j++) {
                if(nums1[i-1] == nums2[j-1])
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[nums1.length][nums2.length];
    }

    
}
