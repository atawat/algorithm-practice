package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;


/**
 * 二叉搜索树中的搜索
 * https://leetcode.cn/problems/search-in-a-binary-search-tree/
 */
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }

        if(root.val < val){
            return searchBST(root.right, val);
        }else {
            return searchBST(root.left, val);
        }
    }

    public TreeNode searchBST1(TreeNode root, int val) {
        while(root != null){
            if(root.val == val){
                return root;
            }
            if(val < root.val){
                root = root.left;
            }else {
                root = root.right;
            }
        }

        return null;
    }
}
