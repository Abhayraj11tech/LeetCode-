class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean evenLevel = true;

        while (!q.isEmpty()) {
            int size = q.size();
            int prevVal = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                int currentVal = node.val;

                if (evenLevel) {
                    if (currentVal % 2 == 0 || currentVal <= prevVal) {
                        return false;
                    }
                } else {
                    if (currentVal % 2 != 0 || currentVal >= prevVal) {
                        return false;
                    }
                }

                prevVal = currentVal;

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            evenLevel = !evenLevel;
        }
        return true;
    }
}
