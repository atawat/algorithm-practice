package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class IsSymmetricTests {
    IsSymmetric solution = new IsSymmetric();

    @Test
    void testIsSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);

       assertEquals(true, solution.isSymmetric(root)); 
    }

    @Test
    void testIsSymmetric1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

       assertEquals(false, solution.isSymmetric(root)); 
    }

    @Test
    void testIsSymmetric2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        root.right.left = new TreeNode(5);

       assertEquals(false, solution.isSymmetric(root)); 
    }
}
