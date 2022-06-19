package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class FindFrequentTreeSumTests {
    FindFrequentTreeSum solution = new FindFrequentTreeSum();

    @Test
    void testFindFrequentTreeSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);
        int[] result = solution.findFrequentTreeSum(root);


        assertArrayEquals(new int[]{2,-3,4}, result);
    }

    @Test
    void testFindFrequentTreeSum2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-5);
        int[] result = solution.findFrequentTreeSum(root);


        assertArrayEquals(new int[]{2}, result);
    }
}
