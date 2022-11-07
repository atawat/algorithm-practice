package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/reach-a-number/
 * 754. 到达终点数字
 */
public class ReachANumber {
    public int reachNumber(int target) {
        //经过推到，距离target只有两步的地方 n 与target的关系为 
        // n^2 + n + 2 = 2* target
        //解法即为 求解此方程后+2
        //采用二分求解此方程
        // 此方法只解出了 需要回退的情况，没有解出刚好到达的情况
        if (target < 0)
            target = -target;
        int low = 1;
        int heigh = 2 * target;
        
        int n = 0;
        while (low <= heigh) {
            int mid = low + (heigh - low) / 2;
            int squareTarget = mid * mid + mid + 2;
            if (squareTarget > 2 * target) {
                heigh = mid - 1;
                n = heigh;
            } else if (squareTarget < 2 * target) {
                low = mid + 1;
                n = low;
            } else {
                n = mid;
                break;
            }
        }

        return n + 2;
    }
}
