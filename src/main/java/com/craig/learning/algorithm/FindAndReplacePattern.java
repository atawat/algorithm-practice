package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 查找和替换模式
 * https://leetcode.cn/problems/find-and-replace-pattern/
 */
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String s : words) {
            Map<Character,Character> map1 = new HashMap<>();
            Map<Character,Character> map2 = new HashMap<>();
            boolean match = true;
            for(int i = 0; i< pattern.length();i++){
                
                if(!map1.containsKey(s.charAt(i))){
                    map1.put(s.charAt(i), pattern.charAt(i));
                }
                if(!map2.containsKey(pattern.charAt(i))){
                    map2.put(pattern.charAt(i), s.charAt(i));
                }

                if(s.charAt(i) !=  map2.get(map1.get(s.charAt(i)))){
                    match =false;
                    break;
                }
                if(pattern.charAt(i) != map1.get(map2.get(pattern.charAt(i)))){
                    match =false;
                    break;
                }

                if(map1.get(s.charAt(i)) != pattern.charAt(i)){
                    match =false;
                    break;
                }
            }

            if(match){
                result.add(s);
            }
        }

        return result;
    }
}
