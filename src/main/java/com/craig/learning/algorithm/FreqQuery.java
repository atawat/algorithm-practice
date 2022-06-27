package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/frequency-queries/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */
public class FreqQuery {
    static Map<Integer, Integer> countingMap = new HashMap<>();
    static Map<Integer, List<Integer>> freqMap = new HashMap<>();

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {

        List<Integer> output = new ArrayList<>();

        for(List<Integer> op : queries){
            if(op.get(0) == 1){
                setNewFreq(op.get(1), 1);
            }else if (op.get(0) == 2){
                int freq = countingMap.getOrDefault(op.get(1), 0);
                if(freq != 0){
                    setNewFreq(op.get(1), -1);
                }
            }else{
                List<Integer> freqList = freqMap.get(op.get(1));
                if(freqList != null && !freqList.isEmpty()){
                    output.add(1);
                }else{
                    output.add(0);
                }
            }
        }
        
        
        return output;
    }
    
    static void setNewFreq(int key, int seed){
        int freq = countingMap.getOrDefault(key, 0);
        List<Integer> oldFreq = freqMap.get(freq);
        if(oldFreq == null){
            oldFreq = new ArrayList<>();
            freqMap.put(freq, oldFreq);
        } 
        if (oldFreq.contains(key)){
            oldFreq.remove((Object)key);
        }
        
        int newFreq = freq + seed;
        countingMap.put(key, newFreq);

        List<Integer> newFreqList = freqMap.get(newFreq);
        if(newFreqList == null){
            newFreqList = new ArrayList<>();
            freqMap.put(newFreq, newFreqList);
        }
        newFreqList.add(key);
    }
}
