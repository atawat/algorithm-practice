package com.craig.learning.algorithm;

import java.util.List;
import java.util.PriorityQueue;

/**
 * https://leetcode.cn/problems/smallest-range-covering-elements-from-k-lists/
 * 632.最小区间
 */
public class SmallestRange {

    // 官解小顶堆
    public int[] smallestRange(List<List<Integer>> nums) {
        int max = Integer.MIN_VALUE;
        int minRange = Integer.MAX_VALUE;
        int left = 0;
        int right = Integer.MAX_VALUE;

        int[] index = new int[nums.size()]; // 每一行的当前指针

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>((c1, c2) -> {
            return nums.get(c1).get(index[c1]) - nums.get(c2).get(index[c2]); // 堆里存行号，比较最小值
        });

        for (int i = 0; i < nums.size(); i++) {
            priorityQueue.offer(i);
            max = Math.max(nums.get(i).get(0), max);
        }

        while (true) {
            int minIndex = priorityQueue.poll();
            Integer curMin = nums.get(minIndex).get(index[minIndex]);
            int range = max - curMin;
            if (range < minRange) {
                minRange = range;
                left = curMin;
                right = max;
            }
            index[minIndex]++;

            if (index[minIndex] >= nums.get(minIndex).size()) {
                break;
            }

            priorityQueue.offer(minIndex);
            max = Math.max(max, nums.get(minIndex).get(index[minIndex]));
        }

        return new int[] { left, right };
    }
}
