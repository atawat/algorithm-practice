package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * 子集 II
 * https://leetcode.cn/problems/subsets-ii/
 */
public class SubSetsWithDup {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> temp  = new LinkedList<>();
        for(int i=0;i<nums.length+1;i++){
            backLooking(nums,0, i, temp);
        }

        return result;
    }

    private void backLooking(int[] nums, int start, int length, LinkedList<Integer> temp){
        if(length == 0){
            result.add(new ArrayList<>(temp));
        }
        
        for(int i = start;i< nums.length;i++){
            if(i>start && nums[i] == nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backLooking(nums, i+1,length -1 , temp);
            temp.removeLast();
        }
    }
}
