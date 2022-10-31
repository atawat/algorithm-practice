package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

public class SumRootToLeafNumbers {
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        
        retriveTree(root, 0);
        return sum;
    }

    private void retriveTree(TreeNode node, int num) {
        int rootValue = node.val;
        if (node.left == null && node.right == null) {
            sum += num * 10 + rootValue;
            return;
        }
        if (node.left != null)
            retriveTree(node.left, num * 10 + rootValue);
        if (node.right != null)
            retriveTree(node.right, num * 10 + rootValue);
    }
}
