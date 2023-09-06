class Solution {
    public int countPrefixes(String[] words, String s) {
        String temp = "";
        int count=0;
        for(int i=0; i<s.length(); i++){
            temp+=s.charAt(i);
            for(String word: words){
                if(word.equals(temp)){
                    count++;
                }
            }
        }
        return count;
    }
}