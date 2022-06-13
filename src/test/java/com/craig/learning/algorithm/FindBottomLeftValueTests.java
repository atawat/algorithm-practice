package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class FindBottomLeftValueTests {
    FindBottomLeftValue solution = new FindBottomLeftValue();

    @Test
    void testFindBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(2, solution.findBottomLeftValue(root));
    }

    @Test
    void testFindBottomLeftValue1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        assertEquals(3, solution.findBottomLeftValue(root));
    }
}
