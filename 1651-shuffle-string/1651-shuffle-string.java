class Solution {
    public String restoreString(String s, int[] indices) {
        String temp="";
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices.length;j++){
                if(i==indices[j]){
                    temp+=s.charAt(j);
                }
            }
            
        }
        return temp;
    }
}