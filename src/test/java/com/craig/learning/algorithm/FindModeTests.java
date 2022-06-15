package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class FindModeTests {
    FindMode solution = new FindMode();
    @Test
    void testFindMode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        assertArrayEquals(new int[]{1,2}, solution.findMode(root));
    }    
    
    @Test
    void testFindMode1() {
        //6,2,8,0,4,7,9,null,null,2,6
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(2);
        root.left.right.right = new TreeNode(6);

        assertArrayEquals(new int[]{2,6}, solution.findMode(root));
    }
}
