class Solution {
    public int mostWordsFound(String[] sentences) {
        int count,max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            count=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
            }
            if(max<count){
                max=count;
            }
        }
        return max+1;
    }
}