package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/product-of-array-except-self/
 * 238. 除自身以外数组的乘积
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int preMultiply = 1;

        //先求前缀乘积
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            preMultiply *= nums[i - 1];
            result[i] = preMultiply;
        }

        preMultiply = nums[nums.length-1];
        //此时求后缀乘积
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] *= preMultiply;
            preMultiply *= nums[i];
        }

        return result;
    }
}
