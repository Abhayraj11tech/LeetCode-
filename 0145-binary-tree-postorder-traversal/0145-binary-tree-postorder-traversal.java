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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<>();
        post(sol,root);
        return sol;
    }
    public static void post(List<Integer> sol, TreeNode root){
        if(root == null){
            return;
        }
        post(sol,root.left);
        post(sol,root.right);
        sol.add(root.val);
    }
}