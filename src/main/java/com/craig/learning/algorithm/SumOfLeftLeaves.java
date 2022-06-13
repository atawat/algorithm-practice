package com.craig.learning.algorithm;

import java.util.Stack;

import com.craig.structure.TreeNode;

/**
 * 左叶子之和
 * https://leetcode.cn/problems/sum-of-left-leaves/
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        int num = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.left == null && node.right == null) {
                num += node.val; // 叶子节点 +1
                continue;
            }

            if (node.left != null)
                stack.push(node.left);
            if (node.right != null && (node.right.left != null || node.right.right != null)) {
                stack.push(node.right);
            }
        }

        return num;
    }
}
