class Solution {
    TreeNode parentX = null, parentY = null;
    int depthX = -1, depthY = -1;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        findParentAndDepth(root, x, y, null, 0);
        
        return depthX == depthY && parentX != parentY;
    }
    
    private void findParentAndDepth(TreeNode node, int x, int y, TreeNode parent, int depth) {
        if (node == null) return;
        
        if (node.val == x) {
            parentX = parent;
            depthX = depth;
        } else if (node.val == y) {
            parentY = parent;
            depthY = depth;
        }
        
        findParentAndDepth(node.left, x, y, node, depth + 1);
        findParentAndDepth(node.right, x, y, node, depth + 1);
    }
}
