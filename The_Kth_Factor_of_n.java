class Solution {
    public int kthFactor(int n, int k) {
        int count=0,i;
        for( i=1;i<=n && count<k ;i++){
            if(n%i ==0 ){
                count++;
            }
        }
        return (count==k)?i-1:-1;
        
    }
}
