package com.craig.learning.algorithm;

/**
 * 实现 strStr()（即java里的 indexOf()）,给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出
 * needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 * 链接：https://leetcode.cn/problems/implement-strstr
 * https://leetcode.cn/problems/implement-strstr/
 */
public class StrStr {

    /**
     * 暴力求解
     * 
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        char[] c = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int j = 0;
        int temp = -1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != n[j]) {
                continue;
            }
            temp = i;
            int count = 0;
            while (i < haystack.length() && j < needle.length() && c[i] == n[j]) {
                count++;
                i++;
                j++;
            }
            if (count == needle.length()) {
                break;
            } else {
                i = temp;
                temp = -1;
                j = 0;
            }
        }

        return temp;
    }

    /**
     * kmp算法
     * 
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr2(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int[] next = computeNextFunction(needle);
        int q = -1;
        for (int i = 0; i < n; i++) {
            while (q >= 0 && needle.charAt(q + 1) != haystack.charAt(i)) {
                q = next[q];
            }
            if (needle.charAt(q + 1) == haystack.charAt(i)) {
                q = q + 1;
            }
            if (q == m -1) {
                q = next[q];
                return i - m + 1;
            }
        }

        return -1;
    }

    private int[] computeNextFunction(String needle) {
        int m = needle.length();
        int[] pi = new int[m];
        pi[0] = -1;
        int k = -1;
        for (int i = 1; i < m; i++) {
            while (k >= 0 && needle.charAt(k + 1) != needle.charAt(i)) {
                k = pi[k];
            }
            if (needle.charAt(k + 1) == needle.charAt(i)) {
                k = k + 1;
            }
            pi[i] = k;
        }

        return pi;
    }
}
