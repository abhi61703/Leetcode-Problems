class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];    
        for(int i = 1; i <= n; i++){
            bits[i] = bits[i/2];
            if(i%2 == 1) 
                bits[i]++; 
        }
        return bits;
    }
}