class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            int val = k - arr.get(i).val; 
            if (set.contains(val)) {
                return true; 
            }
            set.add(arr.get(i).val); 
        }
        return false; 
    }

    private void inorderTraversal(TreeNode node, ArrayList<TreeNode> arr) {
        if (node == null) return;
        inorderTraversal(node.left, arr);
        arr.add(node);
        inorderTraversal(node.right, arr);
    }
}
