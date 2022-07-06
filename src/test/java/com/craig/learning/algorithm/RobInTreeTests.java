package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class RobInTreeTests {
    RobInTree solution =new RobInTree();
    @Test
    void testRob() {
        TreeNode root  =new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        assertEquals(7, solution.rob(root));
    }    
    
    @Test
    void testRob1() {
        TreeNode root  =new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(5, solution.rob(root));
    }
}
