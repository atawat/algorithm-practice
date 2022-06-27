package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 划分字母区间
 * https://leetcode.cn/problems/partition-labels/
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[][] map = new int[26][2];
        for (int[] b : map) {
            b[0] = -1;
            b[1] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            if (map[index][0] == -1) {
                map[index][0] = i;
            }

            map[index][1] = i;
        }

        Arrays.sort(map, (a, b) -> {
            return a[0] - b[0];
        });

        List<Integer> result = new ArrayList<>();
        Integer start = null;
        Integer end = null;

        for (int i = 0; i < map.length; i++) {
            if (map[i][0] == -1) {
                continue;
            }
            if (start == null || end == null) {
                start = map[i][0];
                end = map[i][1];
                continue;
            }
            if (map[i][0] < end) {
                end = Math.max(end, map[i][1]);
            } else {
                result.add(end - start + 1);

                start = map[i][0];
                end = map[i][1];
            }

            if (i == map.length - 1) {
                // 计算最后的结果
                result.add(end - start + 1);
            }
        }

        return result;
    }
}
