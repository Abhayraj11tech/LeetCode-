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
    static ArrayList<TreeNode> arr;
    public int kthSmallest(TreeNode root, int k) {
        arr = new ArrayList<>();
        inOrder(root);
        return arr.get(k-1).val;
    }
    public static void inOrder(TreeNode root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            arr.add(root);
            inOrder(root.right);
    }
}