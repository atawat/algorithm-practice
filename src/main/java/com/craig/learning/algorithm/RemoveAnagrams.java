package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveAnagrams {
    public List<String> removeAnagrams(String[] words) {
        Stack<String[]> stack = new Stack<>();
        
        for(int i = 0; i< words.length;i++){
            String wordKey = getWordKey(words[i]);
            if(stack.isEmpty()){
                stack.push(new String[]{words[i] , wordKey }); 
                continue;
            }
            
            if(stack.peek()[1].equals(wordKey)){
                continue;
            }
            stack.push(new String[]{words[i] , wordKey});
        }
        
        List<String> result = new ArrayList<>();
        
        for(int i = stack.size()-1;i>= 0; i--){
            result.add(0, stack.pop()[0]);
        }
        
        return result;
    }
    
    
    private String getWordKey(String word){
        int[] map = new int[26];
        char[] chars = word.toCharArray();
        for(int i =0 ; i<chars.length;i++ ){
            map[chars[i] - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = map.length-1;i>=0;i--){
            if(map[i] > 0){
                sb.append((char)(i+'a') + map[i]);
            }
        }
        
        return sb.toString();
    }  
}
