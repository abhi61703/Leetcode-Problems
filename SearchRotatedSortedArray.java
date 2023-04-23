class Solution {
    public int search(int[] nums, int target) {
        int flag=0,i;
         int n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]==target){
                flag=1;
                return i;
            }
        }
        
            return -1;
        
    }
}
