package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class ConvertBSTTests {
    ConvertBST solution = new ConvertBST();

    @Test
    void testConvertBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        solution.convertBST(root);

        assertEquals(30, root.val);
        assertEquals(36, root.left.val);
        assertEquals(21, root.right.val);
    }
}
