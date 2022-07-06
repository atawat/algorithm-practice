package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class DiameterOfBinaryTreeTests {
    DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
    @Test
    void testDiameterOfBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }
}
