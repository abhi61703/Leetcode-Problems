// Write a function that reverses a string. The input string is given as an array of characters s.

class Solution {
    public void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            temp[j++]=s[i];
        }
        for(int i=0;i<s.length;i++){
            s[i]=temp[i];
        }
    }
}
