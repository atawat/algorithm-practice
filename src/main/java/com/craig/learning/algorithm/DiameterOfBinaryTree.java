package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 二叉树的直径
 * https://leetcode.cn/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        
        retrive(root);
        return max;
    }
    
    private int retrive(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        
        int left = retrive(root.left);
        int right = retrive(root.right);
        max = Math.max(max, right+left);
        
        return Math.max(left,right) +1;
    }
}
