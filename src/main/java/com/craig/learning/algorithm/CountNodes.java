package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 完全二叉树的节点个数
 * https://leetcode.cn/problems/count-complete-tree-nodes/
 */
public class CountNodes {
    public int countNodes(TreeNode root) {
        return getCount(root, null, null);
    }

    private int getCount(TreeNode root, Integer leftHeight, Integer rightHeight) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (leftHeight == null) {
            leftHeight = 0;
            TreeNode left = root.left;
            while (left != null) {
                leftHeight++;
                left = left.left;
            }
        }

        if (rightHeight == null) {
            rightHeight = 0;
            TreeNode right = root.right;
            while (right != null) {
                rightHeight++;
                right = right.right;
            }
        }

        if (leftHeight == rightHeight) {
            return (1 << (leftHeight + 1)) - 1;
        }

        return getCount(root.left, leftHeight - 1, null) + getCount(root.right, null, rightHeight - 1) + 1;
    }
}
