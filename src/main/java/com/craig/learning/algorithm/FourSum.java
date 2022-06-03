package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数相加
 * https://leetcode.cn/problems/4sum/submissions/
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if (nums[0] > target && nums[0] > 0) {
            return new ArrayList<>();
        }
        for (int i = 0; i < nums.length; i++) {
            //减枝
            if (nums[i] > target && (nums[i] >= 0 || target >= 0)) {
            	break; 
            }
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                //减枝
                if (nums[j] + nums[i] > target && (nums[j] + nums[i] >= 0 || target >= 0)) {
                    break;
                }
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int right = nums.length - 1;
                for (int k = j + 1; k < nums.length; k++) {
                    if (k != j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    int nt =   nums[i] + nums[j] + nums[k] + nums[right];
                    while (k < right && nt > target) {
                        right--;
                        nt = nums[i] + nums[j] + nums[k] + nums[right];
                    }
                    if (k == right) {
                        break;
                    }
                    if (nt == target) {
                        result.add(List.of(nums[i], nums[j], nums[k], nums[right]));
                    }
                }
            }
        }

        return result;
    }
}
