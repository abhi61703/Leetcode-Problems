
class Solution {
    public TreeNode createBST(int arr[], int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int st = 0;
        int end = nums.length-1;
        return createBST(nums,st,end);
        
    }
}
