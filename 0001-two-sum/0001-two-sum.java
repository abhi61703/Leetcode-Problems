class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int temp[] = new int[2];
        int k=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    temp[k++]=i;
                    temp[k]=j;
                }
            }
        }
        return temp;
    }
}