import java.util.ArrayList;

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        
        for (int i = 0; i < arr.size() - 1; i++) {
            arr.get(i).left = null;
            arr.get(i).right = arr.get(i + 1);
        }
        arr.get(arr.size() - 1).left = null;
        arr.get(arr.size() - 1).right = null;
        
        return arr.get(0);
    }

    private static void inorderTraversal(TreeNode node, ArrayList<TreeNode> arr) {
        if (node == null) return;
        inorderTraversal(node.left, arr);
        arr.add(node);
        inorderTraversal(node.right, arr);
    }
}
