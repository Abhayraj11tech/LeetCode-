class Solution {
    public boolean checkTree(TreeNode root) {
        int val1 = 0;
        int val2 = 0;
        
        TreeNode node = root.left;
        while (node != null) {
            val1 = node.val;
            node = node.left;
        }

        node = root.right;
        while (node != null) {
            val2 = node.val;
            node = node.right;
        }

        int sum = val1 + val2;
        return sum == root.val;
    }
}
