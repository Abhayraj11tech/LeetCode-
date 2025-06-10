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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        TreeNode invertedRoot = invertTree(root);
        return isSameTree(root, invertedRoot);
    }

    private TreeNode invertTree(TreeNode node) {
        if (node == null) {
            return null;
        }

        TreeNode newRoot = new TreeNode(node.val);
        newRoot.left = invertTree(node.right);
        newRoot.right = invertTree(node.left);

        return newRoot;
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}