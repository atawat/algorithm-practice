package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 二叉树中的最大路径和
 * https://leetcode.cn/problems/binary-tree-maximum-path-sum/submissions/
 */
public class MaxPathSum {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        retriveMax(root);

        return max;
    }

    private int retriveMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(retriveMax(root.left), 0) ;
        int rightMax = Math.max(retriveMax(root.right), 0);

        max = Math.max(max, root.val + leftMax + rightMax);

        return root.val + Math.max(leftMax, rightMax);
    }
}
