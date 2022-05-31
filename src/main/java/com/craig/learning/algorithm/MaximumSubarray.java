package com.craig.learning.algorithm;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        return findMax(nums, 0, nums.length - 1);
    }

    public int findMax(int[] nums, int begin, int end) {
        if(begin == end){
            return nums[begin];
        }
        int mid = (end + begin) / 2;

        int leftMax = findMax(nums, begin, mid);
        int rightMax = findMax(nums, mid + 1 ,end);
        int maxWithMid = findMaxWithMid(nums, begin, end, mid);

        return Math.max(Math.max(leftMax, rightMax), maxWithMid);
    }

    public int findMaxWithMid(int[] nums, int begin, int end, int mid) {
        // int mid = (end - begin) / 2 + begin;

        int leftMax = Integer.MIN_VALUE;
        int leftSum = 0;
        for (int i = mid; i >= begin; i--) {
            leftSum += nums[i];
            if (leftSum > leftMax) {
                leftMax = leftSum;
            }
        }

        int rightMax = Integer.MIN_VALUE;
        int rightSum = 0;
        for (int i = mid + 1; i <= end; i++) {
            rightSum += nums[i];
            if (rightSum > rightMax) {
                rightMax = rightSum;
            }
        }

        return rightMax + leftMax;
    }
}
