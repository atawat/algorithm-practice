package com.craig.learning.algorithm;

public class Dungeon {
    public int solverDd(int[][] dungeons) {
        int m = dungeons.length;
        int n = dungeons[0].length;
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = dungeons[m-1][n-1] > 0 ? 1: 1- dungeons[m-1][n-1];

        for(int i = n -2; i>=0;i--){
            dp[m-1][i] = Math.max(1 , dp[m - 1][i + 1] - dungeons[m - 1][i]);
        }

        for(int i = m -2; i>=0;i--){
            dp[i][n-1] = Math.max(1 ,dp[i+1][n-1] - dungeons[i][n-1]);
        }

        for (int i = m-2; i >= 0; i--) {
            for (int j = n-2; j >= 0; j--) {
                dp[i][j] = Math.max(1, Math.min(dp[i][j+1], dp[i+1][j]) - dungeons[i][j]);
            }
        }

        return dp[0][0];
    }
}
