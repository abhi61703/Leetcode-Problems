class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations){
            char[] c = s.toCharArray();
            if(c[0]=='-' || c[1]=='-')
                x-=1;
            else if(c[0]=='+' || c[1]=='+')
                x+=1;
        }
        return x;
    }
}