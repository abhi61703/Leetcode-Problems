class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(int i=0;i<operations.length;i++){
            String ans = operations[i];
            if(ans.charAt(0)=='-' || ans.charAt(1)=='-'){
                result-=1;
            }
            if(ans.charAt(0)=='+' || ans.charAt(1)=='+'){
                result+=1;
            }
        }
        return result;
    }
}