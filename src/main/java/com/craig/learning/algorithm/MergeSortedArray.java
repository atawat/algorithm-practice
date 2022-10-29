package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/merge-sorted-array/
 * 88. 合并两个有序数组
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int top = m - 1;
        int low = n - 1;
        int index = nums1.length - 1;

        // if (top == -1) {
        //     for (int i = 0; i < nums2.length; i++) {
        //         nums1[i] = nums2[i];
        //     }
        //     return;
        // }

        while (low >= 0) {
            int val;
            if (top >= 0 && nums1[top] >= nums2[low]) {
                val = nums1[top--];
            } else {
                val = nums2[low--];
            }
            nums1[index--] = val;
        }
    }
}
