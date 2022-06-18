package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 * https://leetcode.cn/problems/permutations/
 */
public class Permute {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] map;

    public List<List<Integer>> permute(int[] nums) {
        map = new boolean[nums.length];
        backLooking(nums, new LinkedList<>());
        return result;
    }

    private void backLooking(int[] nums, LinkedList<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (map[i]) {
                continue;
            }
            temp.add(nums[i]);
            map[i] = true;
            backLooking(nums, temp);
            temp.removeLast();
            map[i] = false;
        }
    }
}
