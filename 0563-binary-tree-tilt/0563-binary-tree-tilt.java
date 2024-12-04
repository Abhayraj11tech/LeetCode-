class Solution {
    public int findTilt(TreeNode root) {
        int[] tilt = new int[1];
        sol(root, tilt);
        return tilt[0];
    }

    private int sol(TreeNode node, int[] tilt) {
        if (node == null) {
            return 0;
        }
        int sum1 = sol(node.left, tilt);
        int sum2 = sol(node.right, tilt);
        tilt[0] += Math.abs(sum1 - sum2);
        return sum1 + sum2 + node.val;
    }
}
