package com.craig.learning.algorithm;

import java.util.Stack;

import com.craig.structure.TreeNode;

/**
 * 验证二叉搜索树
 * https://leetcode.cn/problems/validate-binary-search-tree/
 */
public class IsValidBST {
    Stack<Integer> stack = new Stack<>();

    public boolean isValidBST(TreeNode root) {
           return retriveTree(root);
    }

    private boolean retriveTree(TreeNode root){
        if(root.left != null){
            if(!retriveTree(root.left)){
                return false;
            }
            if(stack.peek() >= root.val){
                return false;
            }
        }
        if(!stack.isEmpty() && root.val <= stack.peek()){
            return false;
        }
        stack.push(root.val);
        if(root.right != null){
            if(!retriveTree(root.right)){
                return false;
            }
            if(stack.peek() <= root.val){
                return false;
            }
        }

        return true;
    }
}
