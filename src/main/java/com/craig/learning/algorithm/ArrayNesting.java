package com.craig.learning.algorithm;

/**
 * 数组嵌套
 * https://leetcode.cn/problems/array-nesting/
 */
public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int size = 0;
            int next = i;
            while(next != -1){
                int index = next;
                next = nums[index];
                if(next == -1){
                    break;
                }
                nums[index] = -1;
                size++;
            }

            result = Math.max(result, size);
        }

        return result;
    }
}
