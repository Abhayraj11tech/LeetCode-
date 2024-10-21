class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> sol = new LinkedList<>();
        if (root == null) {
            return -1;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            long sum = 0;
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
            sol.add(sum);
        }

        Collections.sort(sol);
        if (sol.size() >= k) {
            return sol.get(sol.size() - k);
        } else {
            return -1;
        }
    }
}
