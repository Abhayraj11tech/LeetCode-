class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sol = 0;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.left != null) {
                if (current.left.left == null && current.left.right == null) {
                    sol += current.left.val;
                } else {
                    queue.add(current.left);
                }
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return sol;
    }
}
