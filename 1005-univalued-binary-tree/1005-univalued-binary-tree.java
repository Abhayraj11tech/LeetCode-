class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true; 
        }
        int rootValue = root.val;
        return isUnivalTreePreorder(root, rootValue);
    }

    private boolean isUnivalTreePreorder(TreeNode node, int expectedValue) {
        if (node == null) {
            return true;
        }

        if (node.val != expectedValue) {
            return false;
        }

       
        if (!isUnivalTreePreorder(node.left, expectedValue)) {
            return false;
        }
        if (!isUnivalTreePreorder(node.right, expectedValue)) {
            return false;
        }
        return true;
    }
}