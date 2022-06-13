package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.Map;

import com.craig.structure.TreeNode;

/**
 * 各种二叉树构造方法
 */
public class TreeBuilder {
    //加速中序数组的查找速度
    Map<Integer, Integer> valMap = new HashMap<>();
    /**
     * 从中序与后序遍历序列构造二叉树
     * https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
     * 
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 1 && postorder.length == 1) {
            return new TreeNode(inorder[0]);
        }
        for (int i = 0; i < inorder.length; i++) {
            valMap.put(inorder[i], i);
        }
        return buildTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inEnd - inStart < 0 || postEnd - postStart < 0) {
            return null;
        }
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        if (inStart == inEnd && postStart == postEnd) {
            return root;
        }

        int inRoot = valMap.get(rootVal);
        int leftCount = inRoot - inStart;
        int rightCount = inEnd - inRoot;

        if (leftCount > 0) {
            TreeNode left = buildTree(inorder, postorder, inStart, inRoot - 1, postStart, postStart + leftCount - 1);
            root.left = left;
        }

        if (rightCount > 0) {
            TreeNode right = buildTree(inorder, postorder, inRoot + 1, inEnd, postEnd - rightCount, postEnd - 1);
            root.right = right;
        }
        return root;
    }
}
