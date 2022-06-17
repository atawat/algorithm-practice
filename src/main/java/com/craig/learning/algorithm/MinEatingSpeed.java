package com.craig.learning.algorithm;

/**
 * 爱吃香蕉的珂珂
 * https://leetcode.cn/problems/koko-eating-bananas/submissions/
 */
public class MinEatingSpeed {

    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        int low = 1;
        int heigh = max; // 最大堆为上限

        int k = heigh; // 最大速度

        while (low < heigh) {
            int speed = (low + heigh) / 2;
            long time = calculateTime(piles, speed);
            if (time <= h) {
                heigh = speed;
                k = speed;
            } else {
                low = speed + 1; // 时间大于h，说明慢了，要加速，speed+1
            }
        }

        return k;
    }

    private int calculateTime(int[] piles, int speed) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {

            //time += Math.ceil(piles[i] / (double) speed); // 注意用double来算出小数
            time += (piles[i]+speed-1)/speed; // 高速计算上限
        }

        return time;
    }
}
