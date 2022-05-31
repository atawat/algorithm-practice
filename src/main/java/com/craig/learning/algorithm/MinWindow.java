package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MinWindow {
    // 暴力法-矩阵 太难写了
    // public String minWindow(String s, String t) {
    // Map<Character, Integer> cIndex = new HashMap<>();
    // Map<Character, ArrayList<Integer>> cMap = new HashMap<>();
    // Integer[][] matrix = new Integer[t.length()][];
    // for(int i =0;i<t.length();i++){
    // char c = t.substring(i, i).charAt(0);
    // cIndex.put(c, i) ;
    // cMap.put(c, new ArrayList<>());
    // }
    // int indexPosition =0;
    // for(char c: s.toCharArray()){
    // Integer index = cIndex.get(c);
    // if(index != null){
    // cMap.get(c).add(indexPosition);
    // }
    // indexPosition++;
    // }

    // for(Entry<Character, Integer> entry : cIndex.entrySet()){
    // List<Integer> positionList = cMap.get(entry.getKey());
    // Integer[] position = new Integer[positionList.size()];

    // matrix[entry.getValue()] = positionList.toArray(position);
    // }

    // for(int i =0;i<matrix.length -1 ;i++){
    // Integer[] position = matrix[i];
    // for(int j = 0;j<position.length;j++){

    // }
    // }
    // }

    // 窗口法，如何判断包含字串

    private Map<Character, List<Integer>> positionMap = new HashMap<>();
    private Map<Character, Integer> tMap = new HashMap<>();

    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int minleft = -1;
        int minRight = -1;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
            positionMap.put(c, new ArrayList<>());
        }
        while (right < s.length()) {
            char c = s.charAt(right);
            if (tMap.containsKey(c)) {
                positionMap.get(c).add(right);
            }
            while (check() && left <= right) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minleft = left;
                    minRight = right;
                }
                char previous = s.charAt(left);
                if (positionMap.containsKey(previous)) {
                    positionMap.get(previous).remove((Object) left);
                }
                left++;

            } 
            right++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minleft, minRight + 1);
    }

    private boolean check() {
        boolean result = true;
        for (Entry<Character, List<Integer>> entry : positionMap.entrySet()) {
            if (entry.getValue().size() < tMap.get(entry.getKey())) {
                return false;
            }
        }
        return result;
    }
}
