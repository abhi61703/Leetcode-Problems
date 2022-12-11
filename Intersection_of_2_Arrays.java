// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> res = new LinkedList<Integer>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i ++;
                j ++;
            }
            else if (nums1[i] < nums2[j]) {
                i ++;
            }
            else {
                j ++;
            }
        }
        int[] result = new int[res.size()];
        i = 0;
        for (Integer num:res) {
            result[i++] = num;
        }
        return result;
    }
}
