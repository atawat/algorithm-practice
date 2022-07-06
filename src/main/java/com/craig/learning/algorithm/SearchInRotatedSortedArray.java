package com.craig.learning.algorithm;

/**
 * 搜索旋转排序数组
 * https://leetcode.cn/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }

    public int search(int[] nums, int start, int end, int target){
        int mid = (start + end) /2;
        if(nums[mid] == target){
            return mid;
        }
        if(start > end){
            return -1;
        }
        if(nums[mid] > nums[start] && target < nums[mid] && target >= nums[start]){
            return binarySearch(nums,start, mid -1, target);
        }
        if(nums[mid] < nums[end] && target <= nums[end] && target > nums[mid]){
            return binarySearch(nums,mid + 1,end ,target);
        }
        if(nums[mid] >= nums[start]){
            return search(nums, mid +1, end, target);
        }else {
            return search(nums, start, mid -1, target);
        }
    }

    public int binarySearch(int[] nums, int start, int end, int target){

        while(start <= end){
            int mid = (end + start) / 2;
            if(nums[mid] > target){
                end = mid -1;
            }else if (nums[mid] < target){
                start = mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
