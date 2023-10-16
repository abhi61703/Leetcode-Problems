class Solution {
public String sortSentence(String s) {
  String [] result = new String[s.split(" ").length];
    for(String word : s.split(" ")){
        result[word.charAt(word.length()-1)-'1'] = word.substring(0,word.length()-1);
    }
    return String.join(" ",result);
   }
 }