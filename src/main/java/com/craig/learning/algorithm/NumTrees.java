package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/unique-binary-search-trees/
 * 不同的二叉搜索树
 */
public class NumTrees {

    public int numTrees(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {

            // 每次取j做根节点
            int j = 1;
            int count = 0;
            int mid = (int)Math.ceil(i / 2.0);
            while (j <= mid) {
                count += dp[i - j] * dp[j - 1]; // 左子树 * 右子树的方案
                j++;
            }
            // 跑一半，依据数量是基数还是偶数决定
            count *= 2;
            if(i %2 >0){
                count -= dp[i - mid] * dp[mid -1];
            }

            dp[i] = count;
        }

        return dp[n];
    }
}
