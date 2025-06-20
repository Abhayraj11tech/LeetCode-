class BSTIterator {

    private List<Integer> sol = new ArrayList<>();
    private int i = 0;

    public BSTIterator(TreeNode root) {
        inOrder(root);
    }

    public int next() {
        return sol.get(i++);
    }

    public boolean hasNext() {
        return i < sol.size();
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        sol.add(root.val);
        inOrder(root.right);
    }
}
