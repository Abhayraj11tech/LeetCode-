import java.util.*;

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sol = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            sol = queue.peek().val; 
            while (size-- > 0) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return sol;
    }
}
