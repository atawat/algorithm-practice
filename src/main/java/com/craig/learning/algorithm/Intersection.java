package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Intersection {
    /**
     * 两个数组的交集
     * https://leetcode.cn/problems/intersection-of-two-arrays/
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> set =new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        int[] rArray = new int[result.size()];
        int i =0;
        for(int num : result){
            rArray[i] = num;
            i++;
        }
        return rArray;
    }

    /**
     * 两个数组的交集 II
     * https://leetcode.cn/problems/intersection-of-two-arrays-ii/
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersectionWithDuplicate(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map =new HashMap<>();
        for(int i =0;i<nums1.length;i++){
            int count = map.getOrDefault(nums1[i],0);
            map.put(nums1[i], ++count);
        }
        for(int i =0;i<nums2.length;i++){
            int existSize = map.getOrDefault(nums2[i], 0);
            if( existSize>0){
                result.add(nums2[i]);
                map.put(nums2[i], --existSize);
            }
        }
        int[] rArray = new int[result.size()];
        int i =0;
        for(int num : result){
            rArray[i] = num;
            i++;
        }
        return rArray;
    }
}
