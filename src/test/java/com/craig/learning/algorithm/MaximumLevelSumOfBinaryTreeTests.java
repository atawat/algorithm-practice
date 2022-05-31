package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.craig.structure.TreeNode;

import org.junit.jupiter.api.Test;

public class MaximumLevelSumOfBinaryTreeTests {
    @Test
    void testMaxLevelSum() {
        MaximumLevelSumOfBinaryTree algorithm = new MaximumLevelSumOfBinaryTree();
        TreeNode root = new TreeNode(-100);
        TreeNode l11 = new TreeNode(-200);
        TreeNode l12 = new TreeNode(-300);
        root.left = l11;
        root.right = l12;

        TreeNode l21 = new TreeNode(-20);
        TreeNode l22 = new TreeNode(-5);
        TreeNode l23 = new TreeNode(-10);

        l11.left = l21;
        l11.right = l22;
        l12.left = l23;

        int maxLevel =  algorithm.maxLevelSum(root);

        assertEquals(3, maxLevel);
    }
}
