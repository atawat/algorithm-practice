package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class IsSameTreeTests {
    IsSameTree solution = new IsSameTree();
    @Test
    void testIsSameTree() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);

        assertFalse(solution.isSameTree(root1, root2));
    }
}
