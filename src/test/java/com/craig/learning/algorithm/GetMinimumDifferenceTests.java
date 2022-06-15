package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class GetMinimumDifferenceTests {
    GetMinimumDifference solution = new GetMinimumDifference();

    @Test
    void testGetMinimumDifference() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(48);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(49);
        assertEquals(1, solution.getMinimumDifference(root));
    }
}
