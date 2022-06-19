package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

/**
 *  数组中的第K个最大元素
 * https://leetcode.cn/problems/kth-largest-element-in-an-array/submissions/
 */
public class FindKthLargest {
    //也不慢
    // public int findKthLargest(int[] nums, int k) {
    //     Arrays.sort(nums);
    //     return nums[nums.length - k];
    // }

    //小顶堆 居然是最慢的，还不如原地建堆
    // public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> heap = new PriorityQueue<>(k);

    //     int i =0;
    //     for (Integer num : nums) {
    //         i++;
    //         if (i < k+1) {
    //             heap.add(num);
    //             continue;
    //         }

    //         if(num > heap.peek()){
    //             heap.poll();
    //             heap.add(num);
    //         }

    //     }

    //     return heap.peek();
    // }

    //快速选择 O(n)
    private Random random = new Random();

    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length -1, nums.length - k);
    }

    //选择第i小元素，从0开始
    public int quickSelect(int[] nums, int start, int end,int i){
        int q = partition(nums,start,  end);

        if(i == q){
            return nums[q];
        }else if (i< q){
            return quickSelect(nums, start, q-1, i);
        }else{
            return quickSelect(nums, q+1, end, i);
        }
    }

    //分组，返回 pivot下标
    private int partition(int[] nums, int start, int end) {
        int randomPivot = random.nextInt(end -start + 1) + start;
        //将pivot放最后
        swap(nums, randomPivot, end);
        
        int h =start; //高区指针 指向最后一个低区元素+1的地方
        for (int i = start; i < end; i++) {
            if(nums[end] >= nums[i]){
                swap(nums, h, i);
                h++;
            }
        }

        //将pivot的值换回来
        swap(nums, h, end);

        return h;
    }

    private void swap (int[] nums,int i, int j){
        //同一个引用，元素就变0了
        // nums[i]^=nums[j];
        // nums[j]^=nums[i];
        // nums[i]^=nums[j];

        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
