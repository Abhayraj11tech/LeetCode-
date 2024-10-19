class Solution {
    public boolean isUnivalTree(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        inorderTraversal(root, set);
        return set.size() == 1;
    }

    private void inorderTraversal(TreeNode node, Set<Integer> set) {
        if (node == null) return;
        inorderTraversal(node.left, set);
        set.add(node.val);
        inorderTraversal(node.right, set);
    }
}
