/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> sol = new ArrayList<>();
        traverse(root, sol);
        return sol;
    }

    private void traverse(Node root, List<Integer> sol) {
        if (root == null) {
            return;
        }
        sol.add(root.val);
        for (Node child : root.children) {
            traverse(child, sol);
        }
    }
}
