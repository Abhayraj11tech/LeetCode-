import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                
                if (leftToRight) {
                    level.add(node.val);
                } else {
                    level.add(0, node.val);
                }

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            res.add(level);
            leftToRight = !leftToRight; 
        }

        return res;
    }
}
