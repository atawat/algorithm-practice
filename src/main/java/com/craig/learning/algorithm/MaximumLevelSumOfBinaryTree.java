package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

public class MaximumLevelSumOfBinaryTree {
    int n = 10000;
    int[] levelSum = new int[n];
  
    public void inorder(TreeNode node, int level) {
      if (node != null) {
        inorder(node.left, level + 1);
        levelSum[level] += node.val;
        inorder(node.right, level + 1);
      }
    }
    
    public int maxLevelSum(TreeNode root) {
      inorder(root, 1);
  
      int maxIdx = 0;
      for (int i = 0; i < n; ++i)
        maxIdx = levelSum[i] > levelSum[maxIdx] ? i : maxIdx;
      return maxIdx;
    }
}
