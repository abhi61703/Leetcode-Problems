class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i]%3;
            if(a==0) continue;
            else ans++; 
        }
        return ans;
    }
}