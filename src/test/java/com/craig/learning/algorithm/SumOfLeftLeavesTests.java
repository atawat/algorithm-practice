package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class SumOfLeftLeavesTests {
    SumOfLeftLeaves solution = new SumOfLeftLeaves();
    @Test
    void testSumOfLeftLeaves() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
       
        assertEquals(6, solution.sumOfLeftLeaves(root));
    }
}
