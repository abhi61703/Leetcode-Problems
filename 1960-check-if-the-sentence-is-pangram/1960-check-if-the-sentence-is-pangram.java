class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> h = new HashSet<>();
        for(char c:sentence.toCharArray()){
            h.add(c);
        }
        return h.size()==26;
    }
}