import java.math.BigInteger;
class Solution {
    public String largestNumber(int[] nums) {
        String res="";

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                String s1=Integer.toString(nums[i]);
                String s2=Integer.toString(nums[j]);
                if(((s2+s1).compareTo(s1+s2))>0){   
                    //comparing both string combinations i.e. s1+s2 and s2+s1 
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
            res+=Integer.toString(nums[i]); //appending to final string
        }

        BigInteger resValue = new BigInteger(res);   
        BigInteger zero = BigInteger.valueOf(0);
        
        return resValue.compareTo(zero)==0 ? "0" : res;  
    }
}