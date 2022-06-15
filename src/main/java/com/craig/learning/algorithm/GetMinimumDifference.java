package com.craig.learning.algorithm;

import java.util.Stack;

import com.craig.structure.TreeNode;

/**
 * 二叉搜索树的最小绝对差
 * https://leetcode.cn/problems/minimum-absolute-difference-in-bst/
 */
public class GetMinimumDifference {
    Stack<TreeNode> stack = new Stack<>();
    int minValue = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        retriveTree(root);
        return minValue;
    }

    private void retriveTree(TreeNode root){
        if(root.left != null){
            retriveTree(root.left);
        }
        if(!stack.isEmpty()){
            int abs = Math.abs(root.val - stack.peek().val);
            if(abs < minValue){
                minValue = abs;
            }
        }
        stack.push(root);
        if(root.right != null){
            retriveTree(root.right);
        }
    }
}
