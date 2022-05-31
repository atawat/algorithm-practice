package com.craig.learning.algorithm;

public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int length = 0;
        int windowLength = 1;
        int start = 0;
        int end = 0;
        while (windowLength <= nums.length && length == 0) {
            start = 0;
            end = start + windowLength - 1;
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += nums[i];
            }
            do {
                if (sum >= target) {
                    length = windowLength;
                    break;
                }
                start++;
                end++;

                if (start < nums.length && end < nums.length) {
                    sum -= nums[start - 1];
                    sum += nums[end];
                }
            } while (start < nums.length && end < nums.length);
            windowLength++;
        }

        return length;
    }

    public int minSubArrayLen2(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = nums[0];
        while (left < nums.length && right < nums.length) {

            while (sum < target && right + 1 < nums.length) {
                sum += nums[++right];
            }
            if (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
            }
            sum -= nums[left++];
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
