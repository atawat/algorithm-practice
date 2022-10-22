package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 行星碰撞
 * https://leetcode.cn/problems/asteroid-collision/
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty() && Math.abs(stack.peek()) < Math.abs(asteroids[i])) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result.add(asteroids[i]);
                } else if (Math.abs(stack.peek()) == Math.abs(asteroids[i])) {
                    stack.pop();
                }
            }
        }

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            int rigth = stack.pop();
            if (result.isEmpty() || result.get(result.size() - 1) < 0) {
                result.add(rigth);
            } else {
                result.add(result.size() - i, rigth);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
