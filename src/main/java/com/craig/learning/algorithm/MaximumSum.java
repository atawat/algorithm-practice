package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 6164
 */
public class MaximumSum {
    public int maximumSum(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i =0; i<nums.length;i++){
            int sum = getBitSum(nums[i]);
            PriorityQueue<Integer> indexes  = map.get(sum);
            if(indexes == null){
                indexes = new PriorityQueue<>();
                map.put(sum, indexes);
            }
            if(indexes.size() < 2){
                indexes.add(nums[i]);
            }
            else if(indexes.peek() < nums[i]){
                indexes.poll();
                indexes.add(nums[i]);
            }
  
        }
        
        int result = -1;
        for(Map.Entry<Integer, PriorityQueue<Integer>> entry: map.entrySet()){
            if(entry.getValue().size() <= 1){
                continue;
            }

            result = Math.max(result, entry.getValue().poll() + entry.getValue().poll());
        }

        return result;
    }
    
    private int getBitSum(int num){
        int result =0;
        while(num != 0){
            result += num %10;
            num = num /10;
        }
        
        return result;
    }
}
