package com.craig.learning.algorithm;
/**
 * https://leetcode.cn/problems/jump-game-ii/
 * 跳跃游戏 II
 */
public class Jump {

    public int jump(int[] nums) {

        int distance = 0;
        int step =1;
        int i = 0;
        while (i < nums.length) {
            distance = nums[i] + i;
            if(distance >= nums.length-1){
                break;
            }
            int j = i+1;
            int maxDistance = distance;
            int newstart = -1;
            while(j <= distance && j< nums.length){
                maxDistance = Math.max(maxDistance, j + nums[j]);
                if(maxDistance == j + nums[j]){
                    newstart = j;
                }
                j++;
            }
            if(newstart == -1){
                //跳不出去
                return -1;
            }
            
            step++;

            i = newstart;
        }
        
        return step;
    }
}
