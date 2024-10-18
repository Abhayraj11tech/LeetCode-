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
    public List<Integer> preorderTraversal(TreeNode root) {
         ArrayList<Integer> arr = new ArrayList<>();
        preorderTraversal(root, arr);
        return arr;
    }

    private static void preorderTraversal(TreeNode node, ArrayList<Integer> arr) {
        if (node == null){
            return;
        }
        arr.add(node.val);
        preorderTraversal(node.left, arr);
        preorderTraversal(node.right, arr);
        



    }
}