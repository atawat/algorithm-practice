package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class IsValidBSTTests {
    IsValidBST solution = new IsValidBST();
    
    @Test
    void testIsValidBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void testIsValidBST1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void testIsValidBST2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);

        assertTrue(solution.isValidBST(root));
    }    
    
    @Test
    void testIsValidBST3() {
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(6);

        assertTrue(solution.isValidBST(root));
    }

    @Test
    void testIsValidBST4() {
        TreeNode root = new TreeNode(5);

        assertTrue(solution.isValidBST(root));
    }

    @Test
    void testIsValidBST5() {
        TreeNode root = new TreeNode(120);
        root.left = new TreeNode(70);
        root.right = new TreeNode(145);

        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(100);
        root.right.left = new TreeNode(130);
        root.right.right = new TreeNode(160);

        root.left.left.left = new TreeNode(20);
        root.left.left.right = new TreeNode(55);
        root.left.right.left = new TreeNode(75);
        root.left.right.right = new TreeNode(110);

        root.right.left.left = new TreeNode(119);
        root.right.left.right = new TreeNode(135);
        root.right.right.left = new TreeNode(150);
        root.right.right.right = new TreeNode(200);


        assertFalse(solution.isValidBST(root));
    }    
    
    @Test
    void testIsValidBST6() {
        TreeNode root = new TreeNode(Integer.MIN_VALUE);


        assertTrue(solution.isValidBST(root));
    }
}
