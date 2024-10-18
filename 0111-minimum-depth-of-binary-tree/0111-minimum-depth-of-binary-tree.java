class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0; 
        }
        
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        
        int val1 = minDepth(root.left);
        int val2 = minDepth(root.right);
        
        return Math.min(val1,val2) + 1;
    }
}
