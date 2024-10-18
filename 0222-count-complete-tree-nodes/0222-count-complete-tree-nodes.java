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
    public int countNodes(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();

        inorderTraversal(root, arr);
       return arr.size();
    }

    private static void inorderTraversal(TreeNode node, ArrayList<TreeNode> arr) {
        if (node == null){
            return;
        }
        inorderTraversal(node.left, arr);
        arr.add(node);
        inorderTraversal(node.right, arr);
    }	
}
