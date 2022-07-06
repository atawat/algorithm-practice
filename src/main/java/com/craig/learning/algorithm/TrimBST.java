package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 修剪二叉搜索树
 * https://leetcode.cn/problems/trim-a-binary-search-tree/
 */
public class TrimBST {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null){
            return null;
        }
        if(root.val > high){
            TreeNode left = trimBST(root.left, low, high);
            return left;
        }
        if(root.val < low){
            TreeNode right = trimBST(root.right, low, high);
            return right;
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}
