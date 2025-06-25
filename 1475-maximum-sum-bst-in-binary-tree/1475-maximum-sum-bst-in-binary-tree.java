class Solution {
    class NodeInfo {
        boolean isBST;
        int min, max, sum;

        NodeInfo(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private NodeInfo helper(TreeNode node) {
        if (node == null) {
            return new NodeInfo(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        NodeInfo left = helper(node.left);
        NodeInfo right = helper(node.right);

        if (left.isBST && right.isBST && node.val > left.max && node.val < right.min) {
            int sum = node.val + left.sum + right.sum;
            maxSum = Math.max(maxSum, sum);
            return new NodeInfo(true, Math.min(node.val, left.min), Math.max(node.val, right.max), sum);
        } else {
            return new NodeInfo(false, 0, 0, 0); 
        }
    }
}
