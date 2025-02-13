class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long)num);
        }
        int count = 0;
        while (pq.size() > 1) {
            long x = pq.poll();
            long y = pq.poll();
            if (x >= k) {
                return count;
            }
            long n = 2 * Math.min(x, y) + Math.max(x, y);
            pq.add(n);
            count++;
        }
        return count;
    }
}