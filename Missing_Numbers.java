// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2,Sum=0;
        for(int i=0;i<nums.length;i++) {
            Sum+=nums[i];
        }
        return sum-Sum;
    }
}
