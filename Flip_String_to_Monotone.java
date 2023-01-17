class Solution {
    public int minFlipsMonoIncr(String s) {
        int count=0; 
        int flip=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='0') 
                count = Math.min(flip,count+1); 
            else {
                flip++;
            }
        } 
        return count;
    }
}
