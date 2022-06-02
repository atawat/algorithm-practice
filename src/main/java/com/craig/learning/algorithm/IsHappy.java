package com.craig.learning.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 快乐数
 * https://leetcode.cn/problems/happy-number/submissions/
 */
public class IsHappy {
    public boolean isHappy(int n) {
        Set<Integer> exist = new HashSet<>();

        while (true) {
            int newNum = 0;
            while (n != 0) {
                int bitNum = n % 10;
                newNum += (bitNum * bitNum);
                n = n / 10;
            }
            if(exist.contains(newNum)){
                return false;
            }
            if(newNum == 1){
                return true;
            }
            exist.add(newNum);
            n = newNum;
        }
    }
}
