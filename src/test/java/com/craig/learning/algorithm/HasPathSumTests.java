package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class HasPathSumTests {
    HasPathSum solution = new HasPathSum();

    @Test
    void testHasPathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(5);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        assertTrue(solution.hasPathSum(root, 22)); 
    }

    @Test
    void testHasPathSum1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertFalse(solution.hasPathSum(root, 0)); 
    }

    @Test
    void testHasPathSum2() {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        assertTrue(solution.hasPathSum(root, 0)); 
    }


    @Test
    void testHasPathSumList() {
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        List<List<Integer>> result = solution.pathSum(root, 0); 
        assertEquals(1, result.size()); 
        assertEquals(2, result.get(0).size()); 
    }    
    
    @Test
    void testHasPathSumList1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(5);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        List<List<Integer>> result = solution.pathSum(root, 22); 
        assertEquals(2, result.size()); 
        assertEquals(4, result.get(0).size()); 
        assertEquals(4, result.get(1).size()); 
    }
}
