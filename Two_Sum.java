class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] k=new int[2];
        int m=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    k[m]=i;
                    m++;
                    k[m]=j;
                    break;
                }
            }
        }
        return k;
    }
}
