package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 二叉搜索树中的插入操作
 * https://leetcode.cn/problems/insert-into-a-binary-search-tree/
 */
public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(val > root.val){
            TreeNode right = insertIntoBST(root.right, val);
            root.right = right;
        }else{
            TreeNode left = insertIntoBST(root.left, val);
            root.left = left;
        }
        
        return root;
    }
}
