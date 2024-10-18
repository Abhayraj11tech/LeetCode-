class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }

    private TreeNode search(TreeNode root, int x) {
        TreeNode noot = root;
        while (noot != null) {
            if (noot.val == x) {
                return noot; 
            }
            if (x < noot.val) {
                noot = noot.left;
            } else {
                noot = noot.right;
            }
        }
        return null; 
    }
}
