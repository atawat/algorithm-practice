package com.craig.learning.algorithm;

import java.util.Arrays;

/**
 * K 次取反后最大化的数组和
 * https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/
 */
public class LargestSumAfterKNegations {

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0 && k>0){
                nums[i] = -nums[i];
                k--;
            }
            sum += nums[i];
            
            min = Math.min(min, nums[i]);
        }
        
        if(k == 0){
            return sum;
        }
        if(k % 2 ==0){
            return sum;
        }
        return sum - 2 * min;
    }
}
