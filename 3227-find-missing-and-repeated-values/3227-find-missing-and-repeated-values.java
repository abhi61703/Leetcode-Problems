class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        Set<Integer> seen = new HashSet<>();
        int repeated = -1, missing = -1;

        for (int[] row : grid) {
            for (int num : row) {
                if (!seen.add(num)) {
                    repeated = num;
                }
            }
        }

        for (int num = 1; num <= size; num++) {
            if (!seen.contains(num)) {
                missing = num;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}