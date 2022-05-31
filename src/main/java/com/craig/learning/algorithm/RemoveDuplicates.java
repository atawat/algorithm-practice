package com.craig.learning.algorithm;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int fast = 0;
        int slow = 0;
        while(fast < nums.length){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }

            fast++;
        }

        return slow + 1 ;
    }
}
