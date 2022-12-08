// Given an integer array nums, find the subarray which has the largest sum and return its sum.
//kadane Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int total_max = nums[0];
        int current_max =nums[0];
        for(int i=1; i<nums.length;i++){
            current_max=Math.max(nums[i],nums[i]+current_max);
            total_max=Math.max(current_max,total_max);
        }
        return total_max;
    }
}
