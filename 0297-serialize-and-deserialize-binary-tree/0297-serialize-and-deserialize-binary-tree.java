public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        Queue<String> q = new LinkedList<>(Arrays.asList(nodes));
        return build(q);
    }

    private TreeNode build(Queue<String> q) {
        String val = q.poll();
        if (val.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = build(q);
        root.right = build(q);
        return root;
    }
}
