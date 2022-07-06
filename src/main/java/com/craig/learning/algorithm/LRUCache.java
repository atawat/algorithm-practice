package com.craig.learning.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU 缓存
 * https://leetcode.cn/problems/lru-cache/
 */
public class LRUCache {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int value = map.get(key);
            map.remove(key);
            map.put(key, value);
        }
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (map.size() >= capacity) {
            int removeKey = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                removeKey = entry.getKey();
                break;
            }
            map.remove(removeKey);
        }

        map.put(key, value);
    }
}
