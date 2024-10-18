class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> arr = new ArrayList<>();
        inorderTraversal(root1, arr);
        inorderTraversal(root2, arr);
        Collections.sort(arr);
        return arr;
    }

    private static void inorderTraversal(TreeNode node, List<Integer> arr) {
        if (node == null) return;
        inorderTraversal(node.left, arr);
        arr.add(node.val);
        inorderTraversal(node.right, arr);
    }
}
