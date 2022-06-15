package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;


public class TreeBuilderTests {
    TreeBuilder builder = new TreeBuilder();
    
    @Test
    void testBuildTree() {
       TreeNode root = builder.buildTreeWithInAndPost(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});

       assertEquals(3, root.val);
       assertEquals(9, root.left.val);
       assertEquals(20, root.right.val);
    }

    @Test
    void testBuildTree1() {
       TreeNode root = builder.buildTreeWithInAndPost(new int[]{2,1}, new int[]{2,1});

       assertEquals(1, root.val);
       assertEquals(2, root.left.val);
       assertNull(root.right);
    }    
    
    @Test
    void testBuildTree2() {
       TreeNode root = builder.buildTreeWithInAndPost(new int[]{2,3,1}, new int[]{3,2,1});

       assertEquals(1, root.val);
       assertEquals(2, root.left.val);
       assertNull(root.right);
       assertEquals(3, root.left.right.val);
    }

    @Test
    void testBuildTreeWithPreAndIn(){
      TreeNode  root = builder.buildTreeWithPreAndIn(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
      assertEquals(3, root.val);
      assertEquals(9, root.left.val);
      assertEquals(20, root.right.val);
    }

    @Test
    void testConstructMaximumBinaryTree(){
      TreeNode root = builder.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
      assertEquals(6, root.val);
      assertEquals(3, root.left.val);
      assertEquals(5, root.right.val);

      assertNull(root.left.left);
      assertEquals(2, root.left.right.val);
      assertEquals(1, root.left.right.right.val);

      assertEquals(0, root.right.left.val);
    }
}
