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

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(!st.isEmpty() || root != null){
            if(root != null){
                st.push(root);
                root = root.left;
            }

            else {
                root = st.pop();
                ans.add(root.val);
                root = root.right;
            }
            
        }
        return ans;
    }
}