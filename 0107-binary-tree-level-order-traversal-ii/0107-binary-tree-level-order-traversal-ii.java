import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> sol = new LinkedList<>();
        if (root == null) {
            return sol;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> val = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                val.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            sol.add(0, val);
        }

        return sol;
    }
}
