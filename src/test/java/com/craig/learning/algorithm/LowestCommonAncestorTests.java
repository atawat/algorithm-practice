package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class LowestCommonAncestorTests {
    LowestCommonAncestor solution = new LowestCommonAncestor();

    @Test
    void testLowestCommonAncestor() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(6);

        assertEquals(root, solution.lowestCommonAncestor(root, root.left.right.right, root.right.right)); 
    }


    @Test
    void testLowestCommonAncestor2() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(1);

        assertEquals(root.left.right, solution.lowestCommonAncestor(root, root.left.right.left, root.left.right.right)); 
    }

    @Test
    void testLowestCommonAncestor3() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(1);

        assertEquals(root.left, solution.lowestCommonAncestor(root, root.left, root.left.right.right)); 
    }

    @Test
    void testLowestCommonAncestor4() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(1);

        assertEquals(root.right, solution.lowestCommonAncestor(root, root.right.left ,  root.right.right)); 
    }

    @Test
    void testLowestCommonAncestor5() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(1);

        assertEquals(root.right, solution.lowestCommonAncestor(root, root.right ,  root.right.right)); 
    }

    
    @Test
    void testLowestCommonAncestor6() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(5);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(1);

        assertEquals(root, solution.lowestCommonAncestor(root, root.left ,  root.right)); 
    }
}
