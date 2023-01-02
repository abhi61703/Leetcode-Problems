// We define the usage of capitals in a word to be right when one of the following cases holds:
// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.


class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isFirstCharCapital = false;
        int capitalCount = 0;
        if(Character.isUpperCase(word.charAt(0))) 
            isFirstCharCapital = true;
        for(Character ch : word.toCharArray())
            if(Character.isUpperCase(ch))
                capitalCount++;
        if(capitalCount == word.length() || capitalCount == 0) 
            return true;
        if(capitalCount == 1 && isFirstCharCapital) 
            return true;
        return false;

    }
}
