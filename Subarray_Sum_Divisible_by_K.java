// Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k. 
//A subarray is a contiguous part of an array
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        int[] remainders = new int[k];
        remainders[0] = 1;
        int prefixSum = 0;
        for (int num : nums) {
            prefixSum += num;
            int remainder = ((prefixSum % k) + k) % k;
            res += remainders[remainder]++;
        }
        return res;
    }
}
