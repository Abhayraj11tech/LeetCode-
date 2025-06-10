/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static HashMap<String, Integer> m;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        m = new HashMap<>();
        List<TreeNode> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    static String inorder(TreeNode node, List<TreeNode> res) {
        if (node == null) return "";
        String str = "(";
        str += inorder(node.left, res);
        str += Integer.toString(node.val);
        str += inorder(node.right, res);
        str += ")";
        if (m.getOrDefault(str, 0) == 1) res.add(node);
        m.put(str, m.getOrDefault(str, 0) + 1);
        return str;
    }
}
