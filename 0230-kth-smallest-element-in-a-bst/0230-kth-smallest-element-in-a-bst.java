
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        return k > 0 && k <= arr.size() ? arr.get(k - 1).val : -1;
    }

    private static void inorderTraversal(TreeNode node, ArrayList<TreeNode> arr) {
        if (node == null) return;
        inorderTraversal(node.left, arr);
        arr.add(node);
        inorderTraversal(node.right, arr);
    }
}
