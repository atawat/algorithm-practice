package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * flexport 面试题，句子里随机选单词
 */
public class RandomChoose {
    public String choose(String sentence, int length){
        String[] words = sentence.split(" ");
        HashMap<String, List<Integer>> wordIndexMap = new HashMap<>();
        HashMap<Integer, String> indexWordMap = new HashMap<>();
        
        for (int i = 0; i < words.length; i++) {
            List<Integer> indexList = wordIndexMap.get(words[i]);
            if(indexList == null){
                indexList = new ArrayList<>();
                wordIndexMap.put(words[i], indexList);
            }
            indexList.add(i);
            indexWordMap.put(i, words[i]);
        }
        Random rm = new Random();
        int start = rm.nextInt(words.length);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(words[start] + " ");

            List<Integer> condidateIndex = wordIndexMap.get(words[start]);
            
            start =  (condidateIndex.get(rm.nextInt(condidateIndex.size())) + 1 )  % words.length;
        }

        return result.delete(result.length() -1 , result.length()).toString();
    }

    public String choose1(String sentence, int length, int n){
        String[] words = sentence.split(" ");
        HashMap<String, List<Integer>> wordIndexMap = new HashMap<>();
        HashMap<Integer, String> indexWordMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            List<Integer> indexList = wordIndexMap.get(words[i]);
            if(indexList == null){
                indexList = new ArrayList<>();
                wordIndexMap.put(words[i], indexList);
            }
            indexList.add(i);
            indexWordMap.put(i, words[i]);
        }
        Random rm = new Random();
        int start = rm.nextInt(words.length);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(words[start] + " ");

            List<Integer> condidateIndex = wordIndexMap.get(words[start]);
            
            start =  (condidateIndex.get(rm.nextInt(condidateIndex.size())) + 1 )  % words.length;
        }

        return result.delete(result.length() -1 , result.length()).toString();
    }
}
