package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/shortest-subarray-with-sum-at-least-k/
 * 862. 和至少为 K 的最短子数组
 */
public class ShortestSubarray {
    public int shortestSubarray(int[] nums, int k) {
        //todo:该实现不对
        int left = 0;
        int right = 0;
        int sum = nums[left];
        if (sum >= k) {
            return 1;
        }
        int minLength = Integer.MAX_VALUE;
        while (left < nums.length && right < nums.length) {
            while (++right < nums.length) {
                sum += nums[right];
                if (sum >= k) {
                    minLength = Math.min(minLength, right - left + 1);
                    break;
                }
            }

            while (left < right) {
                sum -= nums[left++];
                if (sum >= k) {
                    minLength = Math.min(minLength, right - left + 1);
                }
            }

        }

        return minLength;
    }
}
