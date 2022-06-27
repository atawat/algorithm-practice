package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 单调递增的数字
 * https://leetcode.cn/problems/monotone-increasing-digits/
 */
public class MonotoneIncreasingDigits {

    // public int monotoneIncreasingDigits(int n) {
    //     int num = n;
    //     List<Integer> bit = new LinkedList<Integer>();
    //     while (num != 0) {
    //         int cur = num % 10;
    //         bit.add(0, cur);
    //         num = num / 10;
    //     }

    //     boolean changeed = false;
    //     for (int i = 0; i < bit.size(); i++) {
    //         if (changeed) {
    //             bit.set(i, 9);
    //         } else if (i < bit.size() - 1 && bit.get(i) > bit.get(i + 1)) {
    //             while (i > 0 && bit.get(i) == bit.get(i - 1)) {
    //                 i--;
    //             }
    //             changeed = true;
    //             bit.set(i, bit.get(i) - 1);
    //         }
    //     }

    //     int result = 0;
    //     for (int i = 0; i < bit.size(); i++) {
    //         result = result * 10 + bit.get(i);
    //     }

    //     return result;
    // }

    //别人的解,从右开始遍历，遇到一个非递增位置，对前面的位置减1，将当前位置标记为开始位置，开始位置（含）之后全置为9
    public int monotoneIncreasingDigits(int N) {
        String[] strings = (N + "").split("");
        int start = strings.length;
        for (int i = strings.length - 1; i > 0; i--) {
            if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i - 1])) {
                strings[i - 1] = (Integer.parseInt(strings[i - 1]) - 1) + "";
                start = i;
            }
        }
        for (int i = start; i < strings.length; i++) {
            strings[i] = "9";
        }
        return Integer.parseInt(String.join("",strings));
    }
}
