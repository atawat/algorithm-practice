package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class BinaryTreePathsTests {
    BinaryTreePaths solution = new BinaryTreePaths();

    @Test
    void testBinaryTreePaths() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        root.right.left = new TreeNode(6);

        List<String> result = solution.binaryTreePaths(root);
        assertEquals(3, result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
