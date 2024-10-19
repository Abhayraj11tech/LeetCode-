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
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> val = new HashSet<>();
        inorderTraversal(root, val);
        
        if (val.size() < 2) {
            return -1;
        }
        
        List<Integer> sol = new ArrayList<>(val);
        Collections.sort(sol);
        
        return sol.get(1);
    }

    private static void inorderTraversal(TreeNode node, Set<Integer> val) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, val);
        val.add(node.val);
        inorderTraversal(node.right, val);
    }
}
