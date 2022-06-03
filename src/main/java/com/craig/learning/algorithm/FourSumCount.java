package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 四数相加II
 * https://leetcode.cn/problems/4sum-ii/
 */
public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                int count = map.getOrDefault(sum, 0) + 1;
                map.put(sum, count);
            }
        }
        int total = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int target = 0- (nums3[i] + nums4[j]);
                Integer size = map.get(target);
                if(size != null){
                    total += size;  
                }
            }
        }

        return total;
    }
}