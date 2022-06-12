package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 串联字符串的最大长度
 * https://leetcode.cn/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
 */
public class MaxConcatenatedLength {
    public int maxLength(List<String> arr) {
        List<Integer> countMap = new ArrayList<>();
        for (String seg : arr) {
            int bitMap = calculateBitNum(seg);
            if(bitMap == -1){
                continue;
            }
            countMap.add(bitMap);
        }

        if(countMap.size() == 0){
            return 0;
        }

        int maxLength = Integer.MIN_VALUE;
        List<Integer> bitMap = new ArrayList<>();
        bitMap.add(0);
        for (int i = 0; i < countMap.size(); i++) {
            Integer map = countMap.get(i);

            int size = bitMap.size();
            for (int j = 0; j < size; j++) {
                int bit = bitMap.get(j);
                if((map & bit) == 0){
                    //兼容
                    int newBit = bit ^ map;
                    bitMap.add(newBit);
                    maxLength = Math.max(maxLength, Integer.bitCount(newBit));
                }
            }
        }

        return maxLength;
    }

    public int calculateBitNum(String arr){
        int num = 0;
        for (int i = 0; i < arr.length(); i++) {
            int bit = 1 << (arr.charAt(i) - 'a');
            if((num & bit) != 0){
                return -1; //串内有重复字符
            }
            num ^=  bit;
        }
        return num;
    }
}
