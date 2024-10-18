class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return getCount(root, low, high);
    }

    int getCount(TreeNode root, int l, int h) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        int sol = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).val >= l && arr.get(i).val <= h) {
                sol += arr.get(i).val;
            }
        }
        return sol;
    }

    private static void inorderTraversal(TreeNode node, ArrayList<TreeNode> arr) {
        if (node == null) return;
        inorderTraversal(node.left, arr);
        arr.add(node);
        inorderTraversal(node.right, arr);
    }
}
