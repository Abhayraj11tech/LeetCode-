class Solution {
    void inorder(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) {
            return;
        }
        inorder(node.left, arr);
        arr.add(node.val);
        inorder(node.right, arr);
    }

    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean flag = true;
        inorder(root, arr);
        int prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= prev) {
                flag = false;
            }
            prev = arr.get(i);
        }
        return flag;
    }
}
