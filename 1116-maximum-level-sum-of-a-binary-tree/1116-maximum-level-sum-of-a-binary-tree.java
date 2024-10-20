class Solution {
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int sol = 0;
        if (root == null) {
            return sol;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            if (sum > max) {
                max = sum;
                sol = count;
            }
            ++count;
        }

        return sol;
    }
}
