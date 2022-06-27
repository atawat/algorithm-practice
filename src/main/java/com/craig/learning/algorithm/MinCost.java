package com.craig.learning.algorithm;

/**
 * 剑指 Offer II 091. 粉刷房子
 * https://leetcode.cn/problems/JEj789/
 */
public class MinCost {
    public int minCost(int[][] costs) {
        //省略数组
        // int[][] t = new int[costs.length][3]; //当刷到房子i时，刷各种颜色的总成本
        // t[0][0] = costs[0][0];
        // t[0][1] = costs[0][1];
        // t[0][2] = costs[0][2];

        int t0 =costs[0][0];
        int t1 =costs[0][1];
        int t2 =costs[0][2];

        for (int i = 1; i < costs.length; i++) {
            int  newt0 = Math.min(t1, t2) + costs[i][0];
            int  newt1 = Math.min(t0, t2) + costs[i][1];
            int  newt2 = Math.min(t0, t1) + costs[i][2];

            t0 = newt0;
            t1 = newt1;
            t2 = newt2;
        }

        return Math.min(Math.min(t0, t1) , t2);
    }
}
