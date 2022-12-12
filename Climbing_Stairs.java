// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

class Solution {
    public int climbStairs(int n) {
        if( n==1||n==2||n==3){
            return n;
        }
        int result=0;
        int a=2,b=3;
        for(int i=3;i<n;i++)
        { 
            result=a+b;
            a=b;
            b=result;
        }
        return result;
    }
}
