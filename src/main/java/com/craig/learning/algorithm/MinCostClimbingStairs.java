package com.craig.learning.algorithm;
/**
 * https://leetcode.cn/problems/min-cost-climbing-stairs/
 * 使用最小花费爬楼梯
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        minCost[0] = 0;
        minCost[1] = 0;

        for (int i = 2; i < cost.length + 1; i++) {
            minCost[i] = Math.min(minCost[i-1] + cost[i-1], minCost[i-2] + cost[i-2]);
        }

        return minCost[minCost.length-1];
    }
}
