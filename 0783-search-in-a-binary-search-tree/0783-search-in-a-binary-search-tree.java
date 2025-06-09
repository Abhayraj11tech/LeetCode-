class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }

        TreeNode l = searchBST(root.left, val);
        TreeNode r = searchBST(root.right, val);

        if (l == null && r == null) {
            return null;
        }
        if (l != null) {
            return l;
        } else {
            return r;
        }
    }
}
