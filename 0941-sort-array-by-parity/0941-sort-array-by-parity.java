class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp[] = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                temp[k++] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)
                temp[k++] = nums[i];
        }
        return temp;
    }
}