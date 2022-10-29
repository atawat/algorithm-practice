package com.craig.learning.algorithm;

import java.util.Random;

/**
 * https://leetcode.cn/problems/next-permutation/
 * 31. 下一个排列
 */
public class NextPermutation {
    // public void nextPermutation(int[] nums) {
    // //笨方法，先找到交换的位置，再排序
    // int target = -1;
    // int minIndex = -1;
    // for (int i = nums.length - 1; i > 0; i--) {
    // for (int j = i - 1; j > target; j--) {
    // if (nums[j] < nums[i]) {
    // target = j;
    // minIndex = i;
    // break;
    // }
    // }

    // }

    // if (target != minIndex) {
    // swap(nums, target, minIndex);
    // }
    // quickSort(nums, target + 1, nums.length - 1);
    // }

    // private void quickSort(int[] nums, int start, int end) {
    // if(start == end -1){
    // if(nums[start]> nums[end]){
    // swap(nums, start, end);
    // }
    // return;
    // }
    // if (start >= end) {
    // return;
    // }
    // int k = partition(nums, start, end);
    // quickSort(nums, start, k);
    // quickSort(nums, k + 1, end);
    // }

    // private int partition(int[] nums, int start, int end) {
    // Random rm = new Random();
    // int randomIndex = start + rm.nextInt(end - start + 1);
    // int pivot = nums[randomIndex];
    // swap(nums, randomIndex, end);
    // int k = start;
    // for (int i = start; i <= end - 1; i++) {
    // if (nums[i] < pivot) {
    // swap(nums, k++, i);
    // }
    // }
    // swap(nums, end, k);

    // return k;
    // }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int target = -1;
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                target = i - 1;
                break;
            }
        }

        if (target != -1) {
            for (int i = nums.length - 1; i > target; i--) {
                if (nums[i] > nums[target]) {
                    swap(nums, i, target);
                    break;
                }
            }
        }

        reverse(nums, target + 1);
    }

    private void reverse(int[] nums, int start) {
        int left = start;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
