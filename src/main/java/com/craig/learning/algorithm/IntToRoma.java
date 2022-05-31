package com.craig.learning.algorithm;

import java.util.HashMap;
import java.util.Map;

public class IntToRoma {
    public String intToRoman(int num) {
        String[][] symble = new String[][] {
                { "I", "V" },
                { "X", "L" },
                { "C", "D" },
                { "M" }
        };
        int depth = 0;
        String result = "";
        while (num > 0) {
            String temp = "";
            int digit = num % 10;
            int i = digit % 5;
            if (i == 4) {
                temp = symble[depth][0];
                if (digit - i > 0) {
                    temp = temp + symble[depth + 1][0];
                } else {
                    temp = temp + symble[depth][1];
                }
            } else {
                for (int j = 0; j < i; j++) {
                    temp = temp + symble[depth][0];
                }
                if (digit - i > 0) {
                    temp = symble[depth][1] + temp;
                }
            }
            result = temp + result;
            num = num / 10;
            depth++;
        }

        return result;
    }

    public int romanToInt(String s) {
        Map<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('I', 1);
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);
        valueMap.put('D', 500);
        valueMap.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = valueMap.get(c);
            if (i  >0) {
                char left = s.charAt(i -1);
                int lValue = valueMap.get(left);
                if (lValue < value) {
                    result -= lValue;
                    value -= lValue;
                }
            }
            result += value;
        }

        return result;
    }
}