package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class RangeModule extends TreeMap<Integer, Integer> {
    public RangeModule() {

    }
    
    public void addRange(int left, int right) {
        super.put(left, right);
    }
    
    public boolean queryRange(int left, int right) {
        return false;
    }
    
    public void removeRange(int left, int right) {

    }

    class Range{
        private int left;
        private int right;

        public Range(int left, int right){
            this.left = left;
            this.right = right;
        }
    }

    public static long repeatedString(String s, long n) {
        Set<Integer> aIndex = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aIndex.add(i);
            }
        }

        long k = n / s.length() * aIndex.size();
        long last = n % s.length();
        for (int i = 0; i < last; i++) {
            if (aIndex.contains(i)) {
                k++;
            }
        }

        return k;
    }
}
