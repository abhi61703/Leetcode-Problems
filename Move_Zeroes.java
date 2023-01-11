// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] arr) {
       int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int t =arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
            }

        }
    }
}
