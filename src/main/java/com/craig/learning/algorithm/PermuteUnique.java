package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列 II
 * https://leetcode.cn/problems/permutations-ii/
 */
public class PermuteUnique {

    List<List<Integer>> result = new ArrayList<>();
    boolean[] map;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        map = new boolean[nums.length];
        backLooking(nums, new LinkedList<>());
        return result;
    }


    private void backLooking(int[] nums, LinkedList<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        //boolean[] usedMap = new boolean[21];
        for (int i = 0; i < nums.length; i++) {
            //tricky的判断，map[i-1]==true 或者false都行，但是就只有false的判断最快
            if (i > 0 && nums[i] == nums[i - 1] && map[i - 1] == false) {
                continue;
            }
            if (map[i]) {
                continue;
            }
            temp.add(nums[i]);
            map[i] = true;
            //usedMap[nums[i] + 10] = true;
            backLooking(nums, temp);
            temp.removeLast();
            map[i] = false;
        }
    }
}
