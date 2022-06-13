package com.craig.learning.algorithm;

import java.util.Stack;

import com.craig.structure.TreeNode;

/**
 * 相同的树
 * https://leetcode.cn/problems/same-tree/
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (!isSame(p, q)) {
            return false;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);
        while (!stack.isEmpty()) {
            TreeNode n1 = stack.pop();
            if(stack.isEmpty()){
                return false;
            }
            TreeNode n2 = stack.pop();
            if (!isSame(n1, n2)) {
                return false;
            }

            if (n1.right != null)
                stack.push(n1.right);
            if (n2.right != null)
                stack.push(n2.right);
            if (n1.left != null)
                stack.push(n1.left);
            if (n2.left != null)
                stack.push(n2.left);
        }

        return stack.isEmpty();
    }

    private boolean isSame(TreeNode p, TreeNode q) {
        if (p.val != q.val) {
            return false;
        }
        if (p.left == null && q.left != null) {
            return false;
        }
        if (p.left != null && q.left == null) {
            return false;
        }
        if (p.right == null && q.right != null) {
            return false;
        }
        if (p.right != null && q.right == null) {
            return false;
        }

        return true;
    }
}
