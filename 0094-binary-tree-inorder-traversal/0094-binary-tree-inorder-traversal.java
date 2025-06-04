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
        List<Integer> sol = new ArrayList<>();
        inOrder(sol,root);
        return sol;
    }
    public static void inOrder(List<Integer> sol, TreeNode root){
        if(root == null){
            return;
        }
        inOrder(sol,root.left);
        sol.add(root.val);
        inOrder(sol,root.right);
    }
}