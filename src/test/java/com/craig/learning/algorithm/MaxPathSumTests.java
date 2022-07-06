package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class MaxPathSumTests {
    MaxPathSum solution = new MaxPathSum();

    @Test
    void testMaxPathSum() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(42, solution.maxPathSum(root)); 
    }

    @Test
    void testMaxPathSum1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertEquals(6, solution.maxPathSum(root)); 
    }

    @Test
    void testMaxPathSum2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);        
        root.right.left = new TreeNode(4);        
        root.right.right = new TreeNode(6);
        assertEquals(14, solution.maxPathSum(root)); 
    }

    @Test
    void testMaxPathSum3() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-2);        
        assertEquals(-1, solution.maxPathSum(root)); 
    }
}
