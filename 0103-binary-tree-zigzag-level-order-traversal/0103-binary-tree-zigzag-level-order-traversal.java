import java.util.*;

// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Info {
    TreeNode node;
    int level;
    Info(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Info> q = new LinkedList<>();

        if (root != null) {
            q.add(new Info(root, 0));
        }

        while (!q.isEmpty()) {
            Info curr = q.poll();
            TreeNode node = curr.node;
            int level = curr.level;

            map.putIfAbsent(level, new ArrayList<>());
            map.get(level).add(node.val);

            if (node.left != null) {
                q.add(new Info(node.left, level + 1));
            }
            if (node.right != null) {
                q.add(new Info(node.right, level + 1));
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int level : map.keySet()) {
            List<Integer> list = map.get(level);
            if (level % 2 == 1) {
                Collections.reverse(list);
            }
            res.add(list);
        }

        return res;
    }
}
