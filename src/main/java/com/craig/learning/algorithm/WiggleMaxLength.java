package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 摆动序列
 * https://leetcode.cn/problems/wiggle-subsequence/
 */
public class WiggleMaxLength {

    // 错误方法,无发正确计算，原因：没有考虑数字的大小，导致只选择高度最低的点
    // int[][] maxLength;
    // int[][] direction; //-1表示负数结尾，需要正差值，1表示正数结尾
    // int max = Integer.MIN_VALUE;
    // public int wiggleMaxLength(int[] nums) {
    // // if(nums.length <=2){
    // // return nums.length;
    // // }

    // maxLength = new int[nums.length][nums.length];
    // direction = new int[nums.length][nums.length];

    // for (int i = 0; i < nums.length; i++) {
    // maxLength[i][i] = 1;
    // }

    // for (int i = 0; i < nums.length; i++) {
    // List<Integer> sequece = new LinkedList<>();
    // sequece.add(nums[i]);
    // for (int j = i+1; j < nums.length; j++) {
    // int gap = nums[j] - sequece.get(sequece.size()-1);
    // if(direction[i][j-1] <= 0 && gap >0){
    // direction[i][j] = 1;
    // maxLength[i][j] = maxLength[i][j-1] + 1;
    // sequece.add(nums[j]);
    // }else if (direction[i][j-1] >= 0 && gap < 0){
    // direction[i][j] = -1;
    // maxLength[i][j] = maxLength[i][j-1] + 1;
    // sequece.add(nums[j]);
    // }else{
    // direction[i][j] = direction[i][j-1];
    // maxLength[i][j] = maxLength[i][j-1];
    // }
    // }

    // max = Math.max(maxLength[i][nums.length-1], max);
    // }

    // return max;
    // }

    // 贪婪 最多的点就在于各个极值点上

    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int preDiff = 0;
        int max = 1; //初始为1 相当于加上最后一个点
        for (int i = 0; i < nums.length - 1; i++) {
            int currentDiff = nums[i + 1] - nums[i];
            if ((currentDiff > 0 && preDiff <= 0) || (currentDiff < 0 && preDiff >= 0)) {
                max++;
            }
            preDiff = currentDiff;
        }

        return max; // 加上两个端点
    }
}
