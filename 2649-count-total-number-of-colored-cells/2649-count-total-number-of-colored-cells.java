class Solution {
    public long coloredCells(int n) {
        long count = 1;
        for(int i=0; i<n; i++){
            count+=i*4;
        }
        return count;
    }
}