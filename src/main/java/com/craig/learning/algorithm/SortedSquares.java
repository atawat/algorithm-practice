package com.craig.learning.algorithm;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] newArray = new int[nums.length];
        int newIndex = nums.length-1;
        while (left <= right) {
            int newVal = nums[left] * nums[left];
            int newVal2 = nums[right] * nums[right];
            if (newVal < newVal2) {
                newArray[newIndex] = newVal2;
                right--;
            } else {
                newArray[newIndex] = newVal;
                left++;
            }
            newIndex--;
        }

        return newArray;
    }
}
