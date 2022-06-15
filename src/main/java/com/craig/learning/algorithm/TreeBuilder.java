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
    public TreeNode buildTreeWithInAndPost(int[] inorder, int[] postorder) {
        if (inorder.length == 1 && postorder.length == 1) {
            return new TreeNode(inorder[0]);
        }
        for (int i = 0; i < inorder.length; i++) {
            valMap.put(inorder[i], i);
        }
        return buildTreeWithInAndPost(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTreeWithInAndPost(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
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
            TreeNode left = buildTreeWithInAndPost(inorder, postorder, inStart, inRoot - 1, postStart, postStart + leftCount - 1);
            root.left = left;
        }

        if (rightCount > 0) {
            TreeNode right = buildTreeWithInAndPost(inorder, postorder, inRoot + 1, inEnd, postEnd - rightCount, postEnd - 1);
            root.right = right;
        }
        return root;
    }

    /**
     * 从前序与中序遍历序列构造二叉树
     * https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTreeWithPreAndIn(int[] preorder, int[] inorder) {
        if (inorder.length == 1 && preorder.length == 1) {
            return new TreeNode(inorder[0]);
        }
        for (int i = 0; i < inorder.length; i++) {
            valMap.put(inorder[i], i);
        }
        return buildTreeWithPreAndIn(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    private TreeNode buildTreeWithPreAndIn(int[] inorder, int[] preorder, int inStart, int inEnd, int preStart, int preEnd) {
        if (inEnd - inStart < 0 || preEnd - preStart < 0) {
            return null;
        }
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        if (inStart == inEnd && preStart == preEnd) {
            return root;
        }

        int inRoot = valMap.get(rootVal);
        int leftCount = inRoot - inStart;
        int rightCount = inEnd - inRoot;

        if (leftCount > 0) {
            TreeNode left = buildTreeWithPreAndIn(inorder, preorder, inStart, inRoot - 1, preStart + 1, preStart + leftCount);
            root.left = left;
        }

        if (rightCount > 0) {
            TreeNode right = buildTreeWithPreAndIn(inorder, preorder, inRoot + 1, inEnd, preEnd - rightCount + 1, preEnd);
            root.right = right;
        }
        return root;
    }

    /**
     * 最大二叉树
     * https://leetcode.cn/problems/maximum-binary-tree/
     * @param nums
     * @return
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 1){
            return new TreeNode(nums[0]);
        }
        return buildMaximumTree(nums, 0, nums.length-1);
    }

    private TreeNode buildMaximumTree(int[] nums, int begin,int end){
        if(end - begin <0){
            return null;
        }
        if(end == begin){
            return new TreeNode(nums[end]);
        }
        
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = begin; i < end +1; i++) {
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }

        TreeNode root = new TreeNode(max);
        root.left = buildMaximumTree(nums,begin,maxIndex-1);
        root.right = buildMaximumTree(nums, maxIndex+1, end);
        return root;
    }
}


