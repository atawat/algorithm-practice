package com.craig.learning.algorithm;

import java.util.Arrays;

/**
 * 找出第 K 小的数对距离
 * https://leetcode.cn/problems/find-k-th-smallest-pair-distance/
 */
public class SmallestDistancePair {
    // 会超时 O(n^2 + nlogn)的复杂度
    // public int smallestDistancePair(int[] nums, int k) {
    // PriorityQueue<Integer> heap = new PriorityQueue<>(k, (c1, c2) -> {
    // return c2 - c1;
    // });
    // int index = 0;
    // for (int i = 0; i < nums.length - 1; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // int gap = Math.abs(nums[i] - nums[j]);
    // if (index < k) {
    // heap.offer(gap);
    // } else {
    // if(gap < heap.peek()){
    // heap.poll();
    // heap.offer(gap);
    // }
    // }

    // index++;
    // }
    // }

    // return heap.peek();
    // }

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = nums[n - 1] - nums[0];
        
        while (left <= right) {
            int mid = (right + left) / 2; // 以数对内的平均值做mid
            int count =0;
            for (int i = 0; i < n; i++) {
                int j = binarySearch(nums, i, nums[i] -mid);
                count += i - j;
            }
            if(count >= k){
                //接近mid的数对数量大于k
                right =mid-1;
            } else{
                left = mid + 1;
            }
        }

        return left;
    }

    /**
     * 查找出接近目标值target，下标
     * @param nums
     * @param end
     * @param target
     * @return
     */
    private int binarySearch(int[] nums, int end, int target){
        int left = 0, right = end;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
