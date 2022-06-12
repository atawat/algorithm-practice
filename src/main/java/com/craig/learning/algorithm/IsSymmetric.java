package com.craig.learning.algorithm;

import java.util.Stack;

import com.craig.structure.TreeNode;

/**
 * 对称二叉树
 * https://leetcode.cn/problems/symmetric-tree/
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        s2.push(root);

        TreeNode leftStop = root.right;
        TreeNode rightStop = root.left;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            TreeNode leftTop = s1.pop();
            TreeNode rightTop = s2.pop();
            if (leftTop == leftStop || rightStop == rightTop) {
                break;
            }

            if (leftTop.val != rightTop.val) {
                return false;
            }

            if (leftTop.left == null && rightTop.right != null) {
                return false;
            }

            if (leftTop.right == null && rightTop.left != null) {
                return false;
            }

            if (leftTop.right != null) {
                s1.push(leftTop.right);
            }
            if (rightTop.left != null) {
                s2.push(rightTop.left);
            }
            if (leftTop.left != null) {
                s1.push(leftTop.left);
            }
            if (rightTop.right != null) {
                s2.push(rightTop.right);
            }
        }

        return s1.isEmpty() && s2.isEmpty();
    }
}
