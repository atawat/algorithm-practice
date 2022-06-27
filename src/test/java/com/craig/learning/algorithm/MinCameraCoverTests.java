package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class MinCameraCoverTests {
    MinCameraCover solution = new MinCameraCover();

    @Test
    void testMinCameraCover() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);

        assertEquals(1, solution.minCameraCover(root));
    }

    @Test
    void testMinCameraCover1() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.right = new TreeNode(0);

        assertEquals(2, solution.minCameraCover(root));
    }

    @Test
    void testMinCameraCover2() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.left.left = new TreeNode(0);
        root.left.left.left.left = new TreeNode(0);
        root.left.left.left.left.right = new TreeNode(0);



        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(0);
        root.right.right.left = new TreeNode(0);

        assertEquals(4, solution.minCameraCover(root));
    }
}
