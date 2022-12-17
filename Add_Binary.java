// Given two binary strings a and b, return their sum as a binary string.
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int digitA = i < 0 ? 0 : a.charAt(i--) - '0';
            int digitB = j < 0 ? 0 : b.charAt(j--) - '0';
            sum.insert(0, (digitA + digitB + carry) % 2);
            carry = (digitA + digitB + carry) / 2;
        }
        return sum.toString();
    }
}
