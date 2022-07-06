package com.craig.learning.algorithm;

import java.util.HashMap;

/**
 * 和为 K 的子数组
 * https://leetcode.cn/problems/subarray-sum-equals-k/
 */
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>(); // 和为key的数量
        countMap.put(0, 1);  //什么都没有的情况和为0
        int prev =0;                     //记录前缀和
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            prev += nums[i];
            if(countMap.containsKey(prev - k)){
                count += countMap.get(prev -k);
            }
            countMap.put(prev, countMap.getOrDefault(prev,0) + 1);
        }
        return count;
    }
}
