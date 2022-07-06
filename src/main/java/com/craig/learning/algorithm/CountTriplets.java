package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/count-triplets-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */
public class CountTriplets {

    // //当r=1时不适用
    // public long countTriplets(List<Long> arr, long r) {
    // Map<Long, Set<Integer>> countMap = new HashMap<>();
    // int i =0;
    // for(Long num : arr){
    // Set<Integer> set = countMap.get(num);
    // if(set == null){
    // set = new HashSet<>();
    // countMap.put(num, set);
    // }

    // set.add(i++);
    // }
    // int result = 0;
    // for(Long num : arr){
    // long need = num * r;
    // int seed = 1;
    // for(int j = 0;j<2;j++){
    // if(!countMap.containsKey(need)){
    // seed = 0;
    // break;
    // }
    // seed *= countMap.get(need).size();
    // need *= r;
    // }

    // result += seed;
    // }

    // return result;
    // }

    //超时
    long count = 0;
    Map<Long, Set<Integer>> countMap = new HashMap<>();

    public long countTriplets(List<Long> arr, long r) {
        if (r == 1L)
            arr.sort((c1, c2) -> (int) (c1 - c2));
        for (int i = 0; i < arr.size(); i++) {
            Set<Integer> set = countMap.get(arr.get(i));
            if (set == null) {
                set = new HashSet<>();
                countMap.put(arr.get(i), set);
            }
            set.add(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            LinkedList<Integer> used = new LinkedList<>();
            used.add(i);
            lookingBack(arr.get(i) * r,  arr, r, used);
        }

        return count;
    }

    private void lookingBack(long target, List<Long> arr, long r, LinkedList<Integer> used) {
        if (used.size() == 3) {
            count++;
            return;
        }

        Set<Integer> set = countMap.get(target);
        if (set == null) {
            return;
        }
        set.forEach(index -> {
            if (r == 1 && (used.contains(index) || used.peekLast() > index ))
                return;

            used.add(index);
            lookingBack(target * r, arr, r, used);
            used.removeLast();
        });
    }
}
