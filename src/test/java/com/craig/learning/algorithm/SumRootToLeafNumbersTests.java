package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class SumRootToLeafNumbersTests {
    SumRootToLeafNumbers solution = new SumRootToLeafNumbers();
    
    @Test
    void testSumNumbers() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        assertEquals(25, solution.sumNumbers(node));
    }
    
    @Test
    void testSumNumbers2() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(0);
        assertEquals(10, solution.sumNumbers(node));
    }
}
