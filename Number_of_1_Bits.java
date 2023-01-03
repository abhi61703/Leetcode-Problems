// Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt=0;
        while(n!=0){
            n=n&(n-1);
            cnt++;
        }
        return cnt; 
    }
}
