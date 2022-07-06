package com.craig.learning.algorithm;

/**
 * 缺失的第一个正数
 * https://leetcode.cn/problems/first-missing-positive/submissions/
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;   //将所有负数职位目标最大值 N+1
            }
        }
        //目标值只可能在[1, n+1]之间，不可能超过数组长度
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]); //当数字小于n时，将 num-1的位置标记为负数
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;  //取第一个非负的角标+1
            }
        }
        return n + 1;
    } 
}
