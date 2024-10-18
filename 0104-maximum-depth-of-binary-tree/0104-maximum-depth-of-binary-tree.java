class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int val1 = maxDepth(root.left);
        int val2 = maxDepth(root.right);

        return Math.max(val1, val2) + 1;
    }
}
