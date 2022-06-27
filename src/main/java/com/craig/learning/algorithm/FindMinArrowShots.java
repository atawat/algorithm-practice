package com.craig.learning.algorithm;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/
 * 用最少数量的箭引爆气球
 */
public class FindMinArrowShots {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (p1,p2)->{
            // if(p1[0] == p2[0]){
            //     return p1[1] - p2[1]; //会溢出
            // }
            // return p1[0] - p2[0];
            
            //依据大值来排序
            if (p1[1] > p2[1]) {
                return 1;
            } else if (p1[1] < p2[1]) {
                return -1;
            } else {
                return 0;
            }
        });

        int arrow =1;
        // int[] interception = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        int pos = points[0][1];
        for (int i = 1; i < points.length; i++) {
            // interception =  getInterception(interception,points[i]);
            // if(interception == null){
            //     arrow++;
            //     interception = points[i];
            // }
            //不需要做交集判断
            if (points[i][0] > pos) {
                pos = points[i][1];
                ++arrow;
            }
        }

        return arrow;
    }

    private int[] getInterception(int[] r1, int[] r2){
        if(r1[1] < r2[0] || r1[0] > r2[1]){
            return null;
        }

        if(r1[1] >= r2[0] && r1[0] < r2[0] && r1[1] < r2[1]){
            return new int[]{r2[0], r1[1]};
        }

        if(r1[0] <= r2[1] && r1[1] > r2[1] && r1[0] > r2[0]){
            return new int[]{r1[0], r2[1]};
        }

        if(r1[0] >=r2[0] && r1[1] <= r2[1]){
            return new int[]{r1[0], r1[1]};
        }

        if(r1[0] <= r2[0] && r1[1] >= r2[1]){
            return new int[]{r2[0], r2[1]};
        }

        return null;
    }
}
