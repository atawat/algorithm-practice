package com.craig.learning.algorithm;

/**
 * 打家劫舍 II
 * https://leetcode.cn/problems/house-robber-ii/
 */
public class RobII {

    public int rob(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(dpWithRange(nums, 0, nums.length -2), dpWithRange(nums, 1, nums.length-1));
    }

    private int dpWithRange(int[] nums, int start, int end) {
        int max0 = 0;
        int max1 = nums[start];

        for (int i = start+1; i <= end; i++) {

            int newMax0 = Math.max(max0, max1);
            int newMax1 = max0 + nums[i];

            max0 = newMax0;
            max1 = newMax1;
        }

        return Math.max(max0, max1);
    }
}
