package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 打家劫舍 III
 * https://leetcode.cn/problems/house-robber-iii/
 */
public class RobInTree {
    public int rob(TreeNode root) {
        // db[0]不打劫，db[1]打劫的收益
        int[] dp = robInTree(root);

        return Math.max(dp[0], dp[1]);
    }

    public int[] robInTree(TreeNode root) {
        //往底层开始,向上传递
        int[] dp = new int[2];
        if (root == null) {
            return dp;
        }
        int[] leftDp = robInTree(root.left);
        int[] rightDp = robInTree(root.right);


        dp[0] = Math.max(leftDp[0], leftDp[1]) + Math.max(rightDp[0], rightDp[1]);
        dp[1] = root.val + leftDp[0] + rightDp[0];
        return dp;
    }
}
