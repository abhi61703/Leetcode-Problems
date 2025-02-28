class Solution {
    public int getLucky(String s, int k) {
        StringBuilder convert = new StringBuilder();
        for(char c : s.toCharArray()){
            convert.append(c - 'a' + 1);
        }

        String num = convert.toString();
        int result = 0 ;
        
        while(k-- > 0){
            result = 0;
            for(char c : num.toCharArray()){
                result+= c - '0' ;
            } 
            num = String.valueOf(result);
        }  
        return result;
    }
}