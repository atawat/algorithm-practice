package com.craig.learning.algorithm;

/**
 * 接雨水
 * https://leetcode.cn/problems/trapping-rain-water/
 */
public class Trap {

    //超时，OOM
    // int[][] max;
    // int[][] maxIndex;
    // Integer[][] cap;

    // public int trap(int[] height) {
    //     max = new int[height.length][height.length];
    //     maxIndex = new int[height.length][height.length];
    //     cap = new Integer[height.length][height.length];

    //     for (int i = 0; i < height.length; i++) {
    //         max[i][i] = height[i];
    //         maxIndex[i][i] = i;
    //         cap[i][i] = 0;
    //     }

    //     for (int i = 0; i < height.length; i++) {
    //         for (int j = i + 1; j < height.length; j++) {
    //             int newMax = Math.max(max[i][j - 1], height[j]);
    //             max[i][j] = newMax;

    //             if (newMax != max[i][j - 1]) {
    //                 maxIndex[i][j] = j;
    //             } else {
    //                 maxIndex[i][j] = maxIndex[i][j - 1];
    //             }
    //         }
    //     }

    //     calCap(0, height.length - 1, height);

    //     return cap[0][height.length - 1];
    // }

    // private int calCap(int start, int end, int[] height) {
    //     if (cap[start][end] != null) {
    //         return cap[start][end];
    //     }
    //     if (Math.abs(end - start) == 1) {
    //         cap[start][end] = 0;
    //         return 0;
    //     }
    //     if (start >= end || end == 0) {
    //         cap[start][end] = 0;
    //         return 0;
    //     }

    //     int leftMax = max[start][end - 1];
    //     int leftMaxIndex = maxIndex[start][end - 1];

    //     int secendMax;
    //     int secendMaxIndex;
    //     if (leftMaxIndex == end - 1) {
    //         secendMax = leftMax;
    //         secendMaxIndex = leftMaxIndex;
    //     } else {
    //         secendMax = max[leftMaxIndex + 1][end - 1];
    //         secendMaxIndex = maxIndex[leftMaxIndex + 1][end - 1];
    //     }

    //     int dh = 0; // 计算增量
    //     int trueStart = leftMaxIndex;
    //     if (height[end] >= leftMax) {
    //         dh = leftMax - secendMax;
    //     } else if (height[end] >= secendMax) {
    //         dh = height[end] - secendMax;
    //     } else {
    //         dh = 0;
    //         trueStart = secendMaxIndex;
    //     }

    //     int dCap = (end - trueStart - 1) * dh;

    //     int capSize = dCap + calCap(leftMaxIndex, secendMaxIndex, height) + calCap(secendMaxIndex, end, height)
    //             + calCap(start, leftMaxIndex, height);

    //     cap[start][end] = capSize;

    //     return capSize;
    // }

    //计算 某个主子i的左右两边的最大值，则最小的那个决定当前主子能承接的水量
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            if(i ==0){
                leftMax[i] = height[i];
            }else{
                leftMax[i] = Math.max(leftMax[i-1], height[i]);
            }
        }

        for (int i = height.length-1; i >= 0; i--) {
            if(i == height.length -1){
                rightMax[i] = height[i];
            }else{
                rightMax[i] = Math.max(rightMax[i+1],height[i]);
            }
        }
        int cap =0;
        for (int i = 0; i < rightMax.length; i++) {
            int boarderMax = Math.min(rightMax[i], leftMax[i]);
            cap += boarderMax - height[i];
        }

        return cap;
    }
}
