package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * https://leetcode.cn/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                Integer another = map.get(need);
                if (another != i) {
                    result[0] = i;
                    result[1] = another;
                    break;
                }
            }
        }

        return result;
    }
}
