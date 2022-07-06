package com.craig.learning.algorithm;

/**
 * 乘积最大子数组
 * https://leetcode.cn/problems/maximum-product-subarray/
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        int[] dpMax = new int[nums.length];    //表示以i结尾时，最大的乘积
        int[] dpMin = new int[nums.length];    //表示以i结尾时，最小的乘积
        //初始dp数组，最大的是自己，最小的也是自己
        System.arraycopy(nums, 0, dpMax, 0, nums.length);
        System.arraycopy(nums, 0, dpMin, 0, nums.length);
        
        for(int i = 1;i<nums.length;i++){
            dpMax[i] = Math.max(nums[i], Math.max(dpMax[i-1] * nums[i], dpMin[i-1]* nums[i]));
            dpMin[i] = Math.min(nums[i], Math.min(dpMax[i-1] * nums[i], dpMin[i-1]* nums[i]));
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dpMax.length; i++) {
            if(dpMax[i]> max){
                max = dpMax[i];
            }
        }
        
        return max;
    }
}
