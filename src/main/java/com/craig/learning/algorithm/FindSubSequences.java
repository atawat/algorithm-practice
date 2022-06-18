package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * 递增子序列
 * https://leetcode.cn/problems/increasing-subsequences/
 */
public class FindSubSequences {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        LinkedList<Integer> temp = new LinkedList<>();

        for(int i = 2;i<nums.length+1;i++){
            backLooking(nums, 0,i,temp);
        }

        return result;
    }

    private void backLooking(int[] nums, int start, int length, LinkedList<Integer> temp){
        if(length == 0){
            result.add(new ArrayList<>(temp));
        }
        Map<Integer, Integer> exist = new HashMap<>();
        for(int i = start; i<nums.length;i++){
            if(exist.containsKey(nums[i])){
                continue;
            }
            exist.put(nums[i],i);
            if(!temp.isEmpty() && nums[i] < temp.getLast()){
                continue;
            }
            
            temp.add(nums[i]);
            backLooking(nums, i + 1,length -1, temp);
            temp.removeLast();
        }
    }
}
