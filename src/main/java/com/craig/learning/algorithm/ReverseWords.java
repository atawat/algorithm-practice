package com.craig.learning.algorithm;

/**
 * 颠倒字符串中的单词
 * https://leetcode.cn/problems/reverse-words-in-a-string/
 */
public class ReverseWords {
    ReverseString reverseSolution = new ReverseString();

    public String reverseWords(String s) {
        char[] c = s.toCharArray();

        int start = 0;
        int end = c.length - 1;
        //移除两端空格
        while(c[start] ==' '){
            start++;
        }
        while(c[end] == ' '){
            end--;
        }
        //移除中间多余的空格
        int newEnd = removeExtraSpace(c,start,end);
        reverseSolution.reverse(c, start, newEnd);

        int i =start;
        int j =start;
        while (i < newEnd) {
            while (i <= newEnd && c[i] != ' ') {
                i++;
            }
            reverseSolution.reverse(c, j, i - 1);
            j = ++i;
        }
        return new String(c).substring(start, newEnd + 1);
    }

    private int removeExtraSpace(char[] c, int start, int end){
        int fast = start;
        int slow = start;
        int newEnd = end;
        while(fast <= end){
            c[slow] = c[fast];

            fast++;
            slow++;
            while(fast < end && c[fast] == ' ' && c[fast + 1] == ' '){
                fast++;
                newEnd--;
            }

        }

        return newEnd;
    }
}
