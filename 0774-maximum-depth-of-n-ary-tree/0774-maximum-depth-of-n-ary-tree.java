import java.util.*;

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            while (size-- > 0) {
                Node current = queue.poll();
                for (Node child : current.children) {
                    queue.add(child);
                }
            }
        }

        return depth;
    }
}
