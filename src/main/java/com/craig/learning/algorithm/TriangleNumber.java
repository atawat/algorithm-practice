package com.craig.learning.algorithm;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/valid-triangle-number/
 * 611. 有效三角形的个数
 */
public class TriangleNumber {

    // public int triangleNumber(int[] nums) {
    //     Arrays.sort(nums);
    // }

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int top = nums[i] + nums[j];
                int end = binarySearch(nums, j + 1, nums.length - 1, top);
                count += end - j;
            }
        }

        return count;
    }

    //返回小于等于target的位置
    public int binarySearch(int[] nums, int start, int end, int target) {
        int left = start;
        int right = end;
        int k = start -1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
                k = mid; //每次记录小于target的位置，最后一个即为最接近target的位置
            } else {
                right = mid - 1;
            }
            mid = (right + left) / 2;
        }

        return k;
    }
}
