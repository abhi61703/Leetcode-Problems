class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) 
            return false;
        if(s1.equals(s2)) 
            return true;
        ArrayList<Integer> index = new ArrayList<>();
        int size = s1.length();
        for(int i=0; i<size; i++){
            if(s1.charAt(i) != s2.charAt(i)) index.add(i);
        }
        if(index.size() != 2) 
            return false;
        int index1 = index.get(0);
        int index2 = index.get(1);
        if(s1.charAt(index1) == s2.charAt(index2)  && s1.charAt(index2) == s2.charAt(index1)){
            return true;
        }
        return false;
    }
}