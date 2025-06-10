/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    private class Res {
        public int val;

        public Res() {
            val = Integer.MIN_VALUE;
        }
    }

    public int maxPathSum(TreeNode root) {
        Res res = new Res();
        findMaxUtil(root, res);
        return res.val;
    }

    int findMaxUtil(TreeNode node, Res res) {
        if (node == null) {
            return 0;
        }

        int l = Math.max(0, findMaxUtil(node.left, res));
        int r = Math.max(0, findMaxUtil(node.right, res));

        int max_top = node.val + l + r;

        res.val = Math.max(res.val, max_top);

        return node.val + Math.max(l, r);
    }
}