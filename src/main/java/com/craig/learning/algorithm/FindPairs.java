package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组中的 k-diff 数对
 * https://leetcode.cn/problems/k-diff-pairs-in-an-array/
 */
public class FindPairs {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int need = nums[i] + k;
            Integer find = binarySearch(nums, i + 1, nums.length - 1, need);
            if (find != null) {
                count++;
            }
        }

        return count;
    }

    private Integer binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return target;
            } else if (nums[mid] > target) {
                end = --mid;
            } else {
                start = ++mid;
            }
        }

        return null;
    }
}
