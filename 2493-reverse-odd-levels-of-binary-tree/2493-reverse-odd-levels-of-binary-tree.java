class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            List<TreeNode> nodes = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                nodes.add(node);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            
            if (count % 2 != 0) {
                for (int i = 0; i < size / 2; i++) {
                    int temp = nodes.get(i).val;
                    nodes.get(i).val = nodes.get(size - 1 - i).val;
                    nodes.get(size - 1 - i).val = temp;
                }
            }
            count++;
        }

        return root;
    }
}
