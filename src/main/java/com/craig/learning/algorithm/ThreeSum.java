package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * https://leetcode.cn/problems/3sum/
 */
public class ThreeSum {
    /*
     * 使用hashmap需要去重 很耗时
     */
    //
    // Map<Integer, List<List<Integer>>> map = new HashMap<>();

    // public List<List<Integer>> threeSum(int[] nums) {
    // if (nums == null || nums.length < 3) {
    // return new ArrayList<>();
    // }
    // Set<Integer> set = new HashSet<>();
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // int sum = nums[i] + nums[j];
    // List<List<Integer>> group = map.get(sum);
    // if (group == null) {
    // group = new ArrayList<>();
    // map.put(sum, group);
    // }
    // boolean skip = false;
    // for (List<Integer> g : group) {
    // if (g.contains(i) || g.contains(j)) {
    // skip = true;
    // break;
    // }
    // if (nums[g.get(0)] == nums[i] || nums[g.get(1)] == nums[i]) {
    // skip = true;
    // break;
    // }
    // }
    // if (skip) {
    // continue;
    // }
    // List<Integer> g = new ArrayList<>();
    // g.add(i);
    // g.add(j);
    // group.add(g);
    // }
    // set.add(nums[i]);
    // }

    // List<List<Integer>> result = new ArrayList<>();
    // for (int i = 0; i < nums.length; i++) {
    // int target = 0 - nums[i];
    // List<List<Integer>> group = map.get(target);
    // if (group == null) {
    // continue;
    // }
    // List<List<Integer>> used = new ArrayList<>();
    // for (List<Integer> g : group) {
    // if (g.contains(i)) {
    // continue;
    // }

    // Integer a1 = g.get(0);
    // Integer a2 = g.get(1);
    // List<Integer> tg = List.of(nums[a1], nums[a2], nums[i]);
    // System.out.println("used i= " + a1 + ",j= " + a2 + ",k= " + i + ", [" +
    // tg.get(0) + "," + tg.get(1)
    // + "," + tg.get(2) + "]");
    // result.add(tg);

    // if (nums[a1] + nums[i] != target || nums[a2] + nums[i] != target) {
    // removeItem(nums[a1] + nums[i], a1, i, group);
    // removeItem(nums[a2] + nums[i], a2, i, group);
    // }

    // used.add(g);
    // }

    // for (List<Integer> list : used) {
    // group.remove(list);
    // }
    // }

    // return result;
    // }

    // private void removeItem(int target, int i, int j, List<List<Integer>> except)
    // {
    // List<List<Integer>> item = map.get(target);
    // if (item == null || item == except) {
    // return;
    // }
    // List<List<Integer>> removed = new ArrayList<>();
    // for (List<Integer> list : item) {
    // if (list.contains(i) || list.contains(j)) {
    // removed.add(list);
    // }
    // }
    // for (List<Integer> list : removed) {
    // item.remove(list);
    // }
    // }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int right = nums.length - 1;
            int target = -nums[i];
            for (int left = i + 1; left < nums.length; left++) {
                if (left > i + 1 && nums[left] == nums[left - 1]) {
                    continue;
                }
                while (left < right && nums[left] + nums[right] > target) {
                    right--;
                }
                if (left == right) {
                    break;
                }
                if (nums[left] + nums[right] == target) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                }
            }

            // int left = i + 1;
            // while(left < right){
            //     if (left > i + 1 && nums[left] == nums[left - 1]) {
            //         left++;
            //         continue;
            //     }
            //     int sum = nums[left] + nums[right];
            //     if(sum > target){
            //         right--;
            //     }else if ( sum < target){
            //         left++;
            //     }else{
            //         result.add(List.of(nums[i], nums[left], nums[right]));
            //         right--;
            //         left++;
            //     }
            // }
        }

        return result;
    }
}
