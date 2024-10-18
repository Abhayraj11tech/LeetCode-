class Solution {
    public int getMinimumDifference(TreeNode root) {
        return absolute_diff(root);
    }

    private int absolute_diff(TreeNode root) {
        int[] sol = {Integer.MAX_VALUE};
        TreeNode[] prev = {null};
        inorderTraversal(root, prev, sol);
        return sol[0];
    }

    private static void inorderTraversal(TreeNode node, TreeNode[] prev, int[] sol) {
        if (node == null) return;
        inorderTraversal(node.left, prev, sol);
        if (prev[0] != null) {
            sol[0] = Math.min(Math.abs(node.val - prev[0].val), sol[0]);
        }
        prev[0] = node;
        inorderTraversal(node.right, prev, sol);
    }
}
