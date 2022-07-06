package com.craig.learning.algorithm;

/**
 * 字符串转换整数 (atoi)
 * https://leetcode.cn/problems/string-to-integer-atoi/
 */
public class MyAtoi {
    public int myAtoi(String s) {
        long seed = 0l;
        Boolean negetive = null;
        char[] charArray = s.toCharArray();

        int start =-1;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == ' '){
                continue;
            }
            start = i;
            break;
        }
        if(start == -1){
            return 0;
        }
        for (int i = start; i < charArray.length; i++) {
            if(charArray[i] == '+' && negetive == null){
                negetive = false;
                continue;
            }else if (charArray[i] == '-' && negetive == null){
                negetive = true;
                continue;
            }
            if (charArray[i] > '9' || charArray[i] < '0') {
                break;
            }
            seed = (charArray[i] - '0') + seed * 10;
            if(seed > Integer.MAX_VALUE){
                return (negetive != null && negetive) ? Integer.MIN_VALUE: Integer.MAX_VALUE;
            }
        }
        long result = (negetive != null && negetive ? -seed : seed);


        return (int) result;
    }
}
