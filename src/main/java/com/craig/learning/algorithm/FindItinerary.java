package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
/**
 * 重新安排行程
 * https://leetcode.cn/problems/reconstruct-itinerary/
 */
public class FindItinerary {
    HashMap<String,PriorityQueue<String>> lineMap = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> list : tickets) {
            if(!lineMap.containsKey(list.get(0))){
                lineMap.put(list.get(0), new PriorityQueue<>());
            }
            if(!lineMap.containsKey(list.get(1))){
                lineMap.put(list.get(1), new PriorityQueue<>());
            }
            lineMap.get(list.get(0)).add(list.get(1));
        }
        List<String> result =new ArrayList<>();
        DFS("JFK", result);
        Collections.reverse(result);
        return result;
    }

    private void DFS(String start, List<String> temp){
        

        PriorityQueue<String> edges = lineMap.get(start);

        while (!edges.isEmpty()) {
            String dest = edges.poll();

            DFS(dest, temp);
        }

        temp.add(start); //欧拉路径的特殊处理，避免进入死胡同
    }
}
