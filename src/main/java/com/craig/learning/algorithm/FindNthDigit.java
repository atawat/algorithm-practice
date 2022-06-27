package com.craig.learning.algorithm;

/**
 * 第 N 位数字
 * https://leetcode.cn/problems/nth-digit/
 */
public class FindNthDigit {
    /*
     * num:10 11 12 13 14 15 16 17 18 19 20  .....  99                   100                    ....     999                  ....                     1000
     * idx:11 13 15 17 19 21 23 25 27 29 31  .....(99-10)*2 + 9 + 2   (99-10)*2 + 9 + 2 +3      ....   (99-10)*2 + 9 + 2 +3 + (999-100) * 3     (99-10)*2 + 9 + 2 +3 + (999-100) * 3 + 4
     * F(9,x) x >= 1 ：
     * F(9,1) = 9;
     * F(9,2)= (99-10) * 2 + (F(9,1)+2)
     * F(9,3)= (999-100) * 3 + (F(9,2) + 3)
     * F(9,n) = (n个9 - (n-1)^10) * n + (F(9,n-1) + n)
     */
    public int findNthDigit(int k) {
        int n = 1;
        long preIndex = 0;
        long prepreIndex = -1;
        do {
            long newIndex = calculateN9Index(n, preIndex);
            System.out.println(newIndex);
            prepreIndex = preIndex;
            preIndex = newIndex;
            n++;
        } while (preIndex < k);

        long gap = k - prepreIndex;
        long count = gap / (n - 1);
        long targetNum = (long)(Math.pow(10, n-2) -1) + count;
        if (gap % (n - 1) == 0) {
            return (int) (targetNum % 10);
        } else {
            return (int) ((targetNum + 1) / Math.pow(10, n - (gap % (n - 1)) - 1) % 10);
        }

    }

    public long calculateN9Index(int n, long preIndex) {
        long seed = 0;
        for (int i = 1; i <= n; i++) {
            seed += 9 * Math.pow(10, i - 1);
        }
        long num = (seed - (long) Math.pow(10, n - 1)) * n; // n个9到n-1个9之间的gap
        return num + preIndex + n;
    }
}
