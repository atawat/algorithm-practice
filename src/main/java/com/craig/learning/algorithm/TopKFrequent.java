package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

/**
 * 前 K 个高频元素
 * https://leetcode.cn/problems/top-k-frequent-elements/
 */
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        int[] result = new int[k];
        int i = 0;

        if(countMap.size() == k){
            for (Entry<Integer, Integer> entry : countMap.entrySet()) {
                result[i] = entry.getKey();
                i++;
            }
            return result;
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>(countMap.size() - k,(e1, e2) -> {
            return e2[1] - e1[1];
        });

        for (Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (i < countMap.size() - k) {
                //构建容量为 n-k的大顶堆
                heap.offer(new int[] { entry.getKey(), entry.getValue() });

            } else {
                if (entry.getValue() < heap.peek()[1]) {
                    // 比大顶堆里最大的要小，说明堆里有位于前K的最大值，置换
                    int[] max = heap.poll();
                    heap.offer(new int[] { entry.getKey(), entry.getValue() });
                    result[countMap.size() - i - 1] = max[0];
                } else {
                    result[countMap.size() - i - 1] = entry.getKey();
                }
            }
            i++;
        }

        return result;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((e1, e2) -> {
            return e1[1] - e2[1];
        });

        int i = 0;
        for (Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (i < k) {
                //构建容量为 k的小顶堆
                heap.offer(new int[] { entry.getKey(), entry.getValue() });
            } else {
                if (entry.getValue() > heap.peek()[1]) {
                    // 比小顶堆里最小还要大，去掉堆里最小
                    heap.poll();
                    heap.offer(new int[] { entry.getKey(), entry.getValue() });
                }
            }
            i++;
        }

        int[] result = new int[k];
        int j =0;
        for (int[] max : heap) {
            result[j] = max[0];
            j++;
        }

        return result;
    }
}
