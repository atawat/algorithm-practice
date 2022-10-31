package com.craig.learning.algorithm;

/**
 * https://leetcode.cn/problems/sqrtx/
 * x 的平方根 
 */
public class MySqrt {
    //超时解
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            long square = (long)mid * mid; //注意用long
            if (square <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    //官解
    public int mySqrt1(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
