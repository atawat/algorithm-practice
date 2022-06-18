package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 子集
 * https://leetcode.cn/problems/subsets/
 */
public class SubSet {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> temp = new LinkedList<Integer>();
        for(int i =0; i< nums.length+1;i++){
            backLooking(nums,0,i,temp);
        }

        return result;
    }

    private void backLooking(int[] nums, int start, int length, LinkedList<Integer> temp){
        if(0 == length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i< nums.length;i++){
            temp.add(nums[i]);
            backLooking(nums, i+1, length -1, temp);
            temp.removeLast();
        }
    }
}
