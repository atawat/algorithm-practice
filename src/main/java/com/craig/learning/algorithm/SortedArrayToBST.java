package com.craig.learning.algorithm;

import com.craig.structure.TreeNode;

/**
 * 将有序数组转换为二叉搜索树
 * https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length -1);
    }

    TreeNode sortedArrayToBST(int[] nums, int start,int end){
        if(start == end){
            return new TreeNode(nums[end]);
        }
        if(start > end){
            return null;
        }
        int mid = (end+start) /2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid -1);
        root.right = sortedArrayToBST(nums, mid+1, end);

        return root;
    }
}
