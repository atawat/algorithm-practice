package com.craig.learning.algorithm;

/**
 * 反转字符串
 * https://leetcode.cn/problems/reverse-string/
 */
public class ReverseString {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    public void reverse(char[] s, int left, int right) {
        while (left < right) {
            s[left] ^= s[right]; // 使用异或来进行交换,第一次异或，s[left] 代表的二进制中位数不同的map，1表示不同的bit，
            s[right] ^= s[left]; // 第二次异或map，将right中不同的位，取反，即为left的值
            s[left] ^= s[right]; // 第三次异或同第二次，将left的不同位取反后，即为right的值

            left++;
            right--;
        }
    }

    /**
     * 反转字符串 II
     * https://leetcode.cn/problems/reverse-string-ii/
     * 
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        char[] sArray = s.toCharArray();
        int length = s.length();
        int count = length / (2 * k);
        int left = length % (2 * k);
        for (int i = 0; i < count; i++) {
            reverse(sArray, i * 2 * k, (2 * i + 1) * k - 1);
        }

        if (left >= k) {
            reverse(sArray, count * 2 * k, (count * 2 + 1) * k -1);
        }else {
            reverse(sArray, count * 2 * k, length -1);
        }

        return new String(sArray);
    }
}
