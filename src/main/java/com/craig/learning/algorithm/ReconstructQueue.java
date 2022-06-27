package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 根据身高重建队列
 * https://leetcode.cn/problems/queue-reconstruction-by-height/
 */
public class ReconstructQueue {
    
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (p1, p2) -> {
            if (p2[0] == p1[0])
                return p1[1] - p2[1];  //身高相同时K小的排前面
            return p2[0] - p1[0];
        });
        LinkedList<int[]> queue = new LinkedList<>();
        for (int[] p : people) {
            queue.add(p[1], p);
        }

        return queue.toArray(new int[people.length][]);
    }
}
