package com.craig.learning.algorithm;

/**
 * 最长连续递增序列
 * https://leetcode.cn/problems/longest-continuous-increasing-subsequence/
 */
public class FindLengthOfLCIS {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int maxLength = -1;

        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                length++;
                continue;
            }
            maxLength = Math.max(maxLength, length);
            length = 1;
        }

        maxLength = Math.max(maxLength, length);

        return maxLength;
    }
}
