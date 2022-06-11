package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.craig.structure.Node;
import com.craig.structure.TreeNode;


public class LevelOrderTests {
    LevelOrder solution = new LevelOrder();

    @Test
    void testLevelOrder() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(3);

        List<List<Integer>> result = solution.levelOrder(root);
        assertEquals(3, result.size());
        assertEquals(2, result.get(1).size());
    }

    @Test
    public void averageOfLevelsTest(){
        TreeNode root = new TreeNode(2147483647);
        root.left = new TreeNode(2147483647);
        root.right = new TreeNode(2147483647);

        //assertArrayEquals(new Double[]{2147483647.0,2147483647.0}, solution.averageOfLevels(root)); 
    }

    @Test
    public void largestValuesTest(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(0);

        List<Integer> result = solution.largestValues(root);
        assertEquals(1, result.get(0));
        assertEquals(4, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(0, result.get(3));
    }

    @Test
    public void connectTest(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.right.right = new Node(7);

        Node result = solution.connect(root);

        
    }
}
