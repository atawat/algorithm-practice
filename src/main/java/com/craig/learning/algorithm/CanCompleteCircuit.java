package com.craig.learning.algorithm;

/**
 * 加油站
 * https://leetcode.cn/problems/gas-station/
 */
public class CanCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length ==1){
            if(gas[0] >= cost[0]){
                return 0;
            }else{
                return -1;
            }
        }

        int sumLeft =0;
        int curSum =0;
        int start =0;
        for(int i =0;i<gas.length;i++){
            sumLeft += gas[i] - cost[i];
            curSum += gas[i] - cost[i];
            if(curSum < 0) {
                start = i+1;
                curSum = 0;
            }
        }

        if(sumLeft < 0){
            return -1;
        }

        return start;
    } 
}
