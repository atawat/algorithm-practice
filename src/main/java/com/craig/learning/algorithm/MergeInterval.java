package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 合并区间
 * https://leetcode.cn/problems/merge-intervals/
 */
public class MergeInterval{
    public int[][] merge(int[][] intervals) {
        if(intervals.length ==1){
            return intervals;
        }
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals ,(a,b)->{
            return a[0] - b[0];
        });


        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i <= intervals.length; i++) {
            if(intervals[i][0] < end){
                end = Math.max(intervals[i][1], end);
            }else{
                result.add(new int[]{start , end});
                start = intervals[i][0];
                end = intervals[i][1];
            }

            if(i == intervals.length -1){
                //最后一组
                result.add(new int[]{start , end});
            }
        }
        int[][] trueResult = new int[result.size()][2];
        result.toArray(trueResult);

        return trueResult;
    }
}