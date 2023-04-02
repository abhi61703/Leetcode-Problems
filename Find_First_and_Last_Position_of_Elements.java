class Solution {
    public int[] searchRange(int[] A, int target) {
	int start = findPosition(A, target, false);
	int end = findPosition(A, target, true);
	return new int[]{start, end};
}

private int findPosition(int[] A, int target, boolean isLast) {
	int low = 0, high = A.length-1, index = -1;
	while (low <= high) {
		int mid = low + ((high - low) >> 1);
		if(isLast){
			if (A[mid] <= target) low = mid + 1;
			else high = mid-1;
		} else{
			if (A[mid] < target) low = mid + 1;
			else high = mid-1;
		}
		if(A[mid] == target) index = mid; /** update index */
	}
	return index;
}
}
