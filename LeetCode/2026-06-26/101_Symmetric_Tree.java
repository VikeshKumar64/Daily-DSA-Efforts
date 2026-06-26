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
    public boolean isSymHelp(TreeNode left, TreeNode right){
        if(left == null || right == null)return left == right;

        if(left.val!=right.val) return false;

        return isSymHelp(left.left, right.right) 
        &&
        isSymHelp(left.right, right.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymHelp(root.left,root.right);
    }
}