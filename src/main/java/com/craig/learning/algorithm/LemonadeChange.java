package com.craig.learning.algorithm;

/**
 * 柠檬水找零
 * https://leetcode.cn/problems/lemonade-change/
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] > 5) {
            return false;
        }

        int fiveCount = 1;
        int tenCount = 0;
        int twentyCount = 0;

        for (int i = 1; i < bills.length; i++) {
            if (bills[i] == 10) {
                fiveCount--;
                tenCount++;
            } else if (bills[i] == 20) {
                twentyCount++;
                if (tenCount > 0) {
                    tenCount--;
                    fiveCount--;
                } else {
                    fiveCount -= 3;
                }

            } else {
                fiveCount++;
            }

            if (fiveCount < 0 || tenCount < 0 || twentyCount < 0) {
                return false;
            }
        }

        return true;
    }
}
