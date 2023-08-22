import java.util.ArrayList;


class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Character> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            String number = String.valueOf(nums[i]);
            for(int j=0;j<number.length();j++){
                a.add(number.charAt(j));
            }
        }
        ArrayList<Integer> i = new ArrayList<>();
        for(Character c: a){
            int digit = Character.getNumericValue(c);
            i.add(digit);
        }
        int[] answer = new int[i.size()];
        for(int j=0;j<answer.length;j++)
        {
            answer[j] = i.get(j);
        }
        return answer;

    }
}