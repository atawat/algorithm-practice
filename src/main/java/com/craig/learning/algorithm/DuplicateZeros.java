package com.craig.learning.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 复写零
 * https://leetcode.cn/problems/duplicate-zeros/
 */
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        //队列法
        Deque<Integer> nextSt = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if (nextSt.isEmpty()) {
                if (arr[i] == 0) {
                    nextSt.addLast(0);
                }
                continue;
            }
            int newVal = nextSt.pop();
            nextSt.addLast(arr[i]);
            if (arr[i] == 0) {
                nextSt.addLast(arr[i]);
            }
            arr[i] = newVal;
        }

        //双指针法
        // int n = arr.length;
        // int top = 0;
        // int i = -1;
        // while (top < n) {
        //     i++;
        //     if (arr[i] != 0) {
        //         top++;
        //     } else {
        //         top += 2;
        //     }
        // }
        // int j = n - 1;

        // //精髓所在
        // if (top == n + 1) {
        //     arr[j] = 0;
        //     j--;
        //     i--;
        // } 
        // while (j >= 0) {
        //     arr[j] = arr[i];
        //     j--;
        //     if (arr[i] == 0) {
        //         arr[j] = arr[i];
        //         j--;
        //     } 
        //     i--;
        // }
    }
}
