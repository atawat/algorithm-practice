package com.craig.learning.algorithm;

import ch.qos.logback.classic.turbo.TurboFilter;

/**
 * https://leetcode.cn/problems/jump-game/
 * 跳跃游戏
 */
public class CanJump {
    //错误
    // public boolean canJump(int[] nums) {
    //     if(nums.length ==1){
    //         return true;
    //     }
    //     int i =0;
    //     while (i < nums.length){
    //         int jump = nums[i];
    //         if(i + jump >= nums.length -1){
    //             return true;
    //         }
    //         int maxStep = 0;
    //         int maxIndex = i +1;
    //         while(jump >0 && i+jump < nums.length){
    //             if(nums[i+jump] > maxStep){
    //                 maxStep = nums[i+jump];
    //                 maxIndex = i+jump;
    //             }
    //             jump--;
    //         }
            
    //         i = maxIndex;
    //     }

    //     return false;
    // }

    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        //覆盖范围, 初始覆盖范围应该是0，因为下面的迭代是从下标0开始的
        int coverRange = 0;
        //在覆盖范围内更新最大的覆盖范围
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, i + nums[i]);
            if (coverRange >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
