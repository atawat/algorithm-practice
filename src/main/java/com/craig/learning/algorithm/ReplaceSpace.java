package com.craig.learning.algorithm;


/**
 * 替换空格
 * https://leetcode.cn/problems/ti-huan-kong-ge-lcof/
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        int spaceSize = 0;
        for (char c : chars) {
            if(c ==' '){
                spaceSize++;
            }   
        }
        if(spaceSize == 0){
            return s;
        }
        s.replace(" ", "%20");
        char[] newString = new char[chars.length + spaceSize * 2];
        int j =0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] !=' '){
                newString[j++] = chars[i];
            }else {
                newString[j++] = '%';
                newString[j++] = '2';
                newString[j++] = '0';
            }
        }

        return new String(newString);
    }

    public String replaceSpaceWithoutSpace(String s) {
        int spaceSize = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) ==' '){
                spaceSize++;
            }   
        }
        if(spaceSize == 0){
            return s;
        }
        int i = s.length() -1;
        for (int j = 0; j < spaceSize; j++) {
            s += "  ";
        }
        
        char[] newString = s.toCharArray();
        int j = newString.length -1 ;
        while( i < j){
            if (newString[i] != ' ') {
                newString[j--] = newString[i];
            } else {
                newString[j--] = '0';
                newString[j--] = '2';
                newString[j--] = '%';
            }
            i--;
        }

        return new String(newString);
    }
}
