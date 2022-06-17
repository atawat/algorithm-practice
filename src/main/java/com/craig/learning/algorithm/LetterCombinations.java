package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LetterCombinations {
    Map<Character, char[]> map = new HashMap<>();
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        map.put('2', new char[] { 'a', 'b', 'c' });
        map.put('3', new char[] { 'd', 'e', 'f' });
        map.put('4', new char[] { 'g', 'h', 'i' });
        map.put('5', new char[] { 'j', 'k', 'l' });
        map.put('6', new char[] { 'm', 'n', 'o' });
        map.put('7', new char[] { 'p', 'q', 'r', 's' });
        map.put('8', new char[] { 't', 'u', 'v' });
        map.put('9', new char[] { 'w', 'x', 'y', 'z' });
        if(digits == null || digits.length() == 0){
            return result;
        }
        combine(new StringBuilder(), 0, digits.length() - 1, digits);

        return result;
    }

    private void combine(StringBuilder sb, int start, int end, String digits) {
        if (start > end) {
            result.add(sb.toString());
            return;
        }
        char[] charArray = map.get(digits.charAt(start));
        for (char c : charArray) {
            sb.append(c);
            combine(sb, start + 1, end, digits);
            sb.deleteCharAt(start);
        }
    }
}
