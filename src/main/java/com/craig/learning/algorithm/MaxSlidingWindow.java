package com.craig.learning.algorithm;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 滑动窗口最大值
 * https://leetcode.cn/problems/sliding-window-maximum/
 */
public class MaxSlidingWindow {
    // 暴力法，会超时
    // public int[] maxSlidingWindow(int[] nums, int k) {
    // if(k == 1){
    // return nums;
    // }

    // int max = findMax(0, k - 1, nums);
    // int[] result = new int[nums.length - k + 1];
    // result[0] = max;

    // int out = -1;
    // int j = 0;
    // for (int i = k; i < nums.length; i++) {

    // out++;
    // j++;
    // if (nums[i] >= max) {
    // max = nums[i];
    // } else if (nums[out] == max) {
    // max = findMax(out + 1, i, nums);
    // }

    // result[j] = max;
    // }

    // return result;
    // }

    // private int findMax(int start, int end, int[] array) {
    //     int max = Integer.MIN_VALUE;
    //     for (int i = start; i <= end; i++) {
    //         if (array[i] > max) {
    //             max = array[i];
    //         }
    //     }

    //     return max;
    // }

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();

        if (k == 1) {
            return nums;
        }

        queue.addLast(nums[0]);
        for (int i = 1; i < k; i++) {
            while(!queue.isEmpty() && nums[i] > queue.peekLast()){
                queue.pollLast();
            }
            queue.addLast(nums[i]);
        }

        int[] result = new int[nums.length - k + 1];
        result[0] = queue.peekFirst();

        int out = -1;
        int j = 0;
        for (int i = k; i < nums.length; i++) {

            out++;
            j++;
            
            if(nums[out] == queue.peekFirst()){
                queue.pollFirst();
            }
            while(!queue.isEmpty() && nums[i] > queue.peekLast()){
                queue.pollLast();
            }
            queue.addLast(nums[i]);


            result[j] = queue.peekFirst();
        }

        return result;
    }
}
