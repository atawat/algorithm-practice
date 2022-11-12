package com.craig.learning.algorithm;

/**
 * 689. 三个无重叠子数组的最大和
 * https://leetcode.cn/problems/maximum-sum-of-3-non-overlapping-subarrays/
 */
public class MaxSumOfThreeSubarrays {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int maxSum1 = 0, maxSum12 = 0, maxSum123 = 0;
        int maxIndex1 = 0, maxIndex2 = 0, maxIndex3 = 0, maxIndex21 = 0;
        int[] result = new int[3];
        for (int i = 0; i < nums.length - 2 * k; i++) {
            sum1 += nums[i];
            sum2 += nums[i + k];
            sum3 += nums[i + k + k];

            if (i >= k - 1) {
                if (sum1 > maxSum1) {
                    maxSum1 = sum1;
                    maxIndex1 = i - k + 1;
                }

                if (maxSum1 + sum2 > maxSum12) {
                    maxSum12 = maxSum1 + sum2;
                    maxIndex21 = maxIndex1; //当maxSum12最大的时候，不一定是是maxSum1最大的时候
                    maxIndex2 = i + 1;
                }

                if (maxSum12 + sum3 > maxSum123) {
                    maxSum123 = maxSum12 + sum3;
                    maxIndex3 = i + k + 1;

                    result[0] = maxIndex21;
                    result[1] = maxIndex2;
                    result[2] = maxIndex3;
                }

                sum1 -= nums[i - k + 1];
                sum2 -= nums[i + 1];
                sum3 -= nums[i + k + 1];
            }
        }
        
        return result;

    }
}
