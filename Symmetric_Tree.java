/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return false;
        else{
            return isSymmetric(root.left,root.right);
        }
    }

    private boolean isSymmetric(TreeNode r1, TreeNode r2)
    {
        if(r1==null && r2==null)
            return true;
        if(r1==null || r2==null)
           return false;
        else{
            if(r1.val!=r2.val)
                return false;
            boolean left = isSymmetric(r1.left,r2.right);
            if(!left)
                return left;
            boolean right = isSymmetric(r1.right,r2.left);
                return right;
        }
    }
}
