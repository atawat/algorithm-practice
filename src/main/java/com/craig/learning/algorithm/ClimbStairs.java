package com.craig.learning.algorithm;

/**
 * 爬楼梯
 * https://leetcode.cn/problems/climbing-stairs/
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if(n ==1){
            return 1;
        }
        if(n ==2){
            return 2;
        }
        int n1= 1;
        int n2= 2;
        //斐波那契函数
        int step = 0;
        for (int i = 3; i <= n; i++) {
            step = n1 + n2;

            n1 = n2;
            n2 = step;
        }

        return step;
    }
}
