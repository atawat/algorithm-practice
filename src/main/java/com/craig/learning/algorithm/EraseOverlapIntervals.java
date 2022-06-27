package com.craig.learning.algorithm;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/non-overlapping-intervals/
 * 无重叠区间
 */
public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> {
            if (i1[1] > i2[1]) {
                return 1;
            } else if (i1[1] == i2[1]) {
                return 0;
            } else {
                return -1;
            }
        });

        int count = 0;
        int border = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < border){
                count++;
            }else{
                border = intervals[i][1];
            }
        }

        return count;
    }
}
