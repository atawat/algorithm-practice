package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.cn/problems/subarrays-with-k-different-integers/
 * K 个不同整数的子数组
 */
public class SubarraysWithKDistinct {

    //暴力法超时
    // public int subarraysWithKDistinct(int[] nums, int k) {
    //     Set<Integer> set = new HashSet<>();

    //     int result = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i; j < i+k && j < nums.length; j++) {
    //             set.add(nums[j]);
    //         }

    //         if (set.size() == k) {
    //             result++;
    //         }

    //         for (int j = i + k; j < nums.length; j++) {
    //             set.add(nums[j]);
    //             if (set.size() == k) {
    //                 result++;
    //             } else if (set.size() > k) {
    //                 break;
    //             }
    //         }

    //         set.clear();;
    //     }

    //     return result;
    // }

    //错误解法
    public int subarraysWithKDistinct(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        while (map.size() < k && right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            right++;
        }

        int result = 0;
        if(map.size() == k){
            result++;
        }
        while(right < nums.length && left <= right-k){
            if(map.containsKey(nums[right]) && map.get(nums[right]) > 0){
                map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
                right++;
                if(map.size() == k){
                    result++;
                }

                continue;
            }

            int removeNum = map.get(nums[left]);
            int length = map.size();
            while(removeNum != 0 && left <= right-k ){
                removeNum = map.get(nums[left]);
                map.put(nums[left++], --removeNum);
                if(removeNum == 0){
                    length--;
                }
                if(length == k){
                    result++;
                }
            }
            if(removeNum == 0){
                map.put(nums[right++], 1);
                result++;
            }
        }


        return result;
    }
}
