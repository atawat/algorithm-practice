package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * https://leetcode.cn/problems/largest-plus-sign/
 * 764. 最大加号标志
 */
public class OrderOfLargestPlusSign {

    public int orderOfLargestPlusSign(int n, int[][] mines) {
        Set<Integer> minesSet = new HashSet<Integer>();
        for (int i = 0; i < mines.length; i++) {
            minesSet.add(mines[i][0] * 1000 + mines[i][1]);
        }

        int[][][] dp = new int[n][n][4]; // dp[i][j][k] 表示grid[i][j]在方向k的时候最大阶数，k取值：0:左,1:上,2:右,3:下
        
        // 先上和左
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (minesSet.contains(i * 1000 + j)) {
                    // 地雷点
                    continue;
                }
                Arrays.fill(dp[i][j], 1);
                if (i != 0) {
                    dp[i][j][1] = dp[i - 1][j][1] + dp[i][j][1];
                }
                if (j != 0) {
                    dp[i][j][0] = dp[i][j - 1][0] + dp[i][j][0];
                }
            }
        }

        int k = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (minesSet.contains(i * 1000 + j)) {
                    // 地雷点
                    continue;
                }
                if (i != n - 1) {
                    dp[i][j][3] = dp[i + 1][j][3] + dp[i][j][3];
                }
                if (j != n - 1) {
                    dp[i][j][2] = dp[i][j + 1][2] + dp[i][j][2];
                }
                int l = Math.min(Math.min(
                        Math.min(dp[i][j][0], dp[i][j][1]), dp[i][j][2]), dp[i][j][3]);
                k = Math.max(k, l);
            }
        }

        return k == Integer.MIN_VALUE ? 0 : k;
    }
}
