package com.craig.learning.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.cn/problems/sum-of-subarray-minimums/
 * 
 */
public class SumSubarrayMins {
    int mode = 1000000007;

    //这种动态规划会超时超出内存
    // public int sumSubarrayMins(int[] arr) {
    //     //int[][] dp = new int[arr.length][arr.length]; //存储从i到j的最小值,超出内存
    //     int sum = 0;
    //     // for (int i = 0; i < arr.length; i++) {
    //     //     dp[i][i] = arr[i];
    //     //     sum = (arr[i] + sum) % mode;
    //     // }

    //     for (int i = 0; i < arr.length; i++) {
    //         sum = (arr[i] + sum) % mode;
    //         int curMin = arr[i];
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[j] < curMin) {
    //                 curMin = arr[j];
    //             } 
    //             sum = (sum + curMin) % mode;
    //         }
    //     }

    //     return sum;
    // }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long ans = 0;
        final int MOD = 1000000007;
        Deque<Integer> monoStack = new ArrayDeque<Integer>();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            while (!monoStack.isEmpty() && arr[monoStack.peek()] > arr[i]) {
                monoStack.pop();
            }
            int k = monoStack.isEmpty() ? (i + 1) : (i - monoStack.peek());
            dp[i] = k * arr[i] + (monoStack.isEmpty() ? 0 : dp[i - k]);
            ans = (ans + dp[i]) % MOD;
            monoStack.push(i);
        }
        return (int) ans;
    }
}
