class Solution {
	public int[] searchRange(int[] nums, int target) {
		int[] temp = {-1,-1};
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                temp[0]=i;
                break;
            }
        }
        for(int j=i;j<nums.length;j++){
            if(nums[j]==target){
                temp[1]=j;
            }
        }
        return temp;
	}
}
