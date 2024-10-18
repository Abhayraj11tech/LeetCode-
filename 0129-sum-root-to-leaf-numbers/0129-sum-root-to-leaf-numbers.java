class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        leafNum(root, 0);
        return sum;
    }

    void leafNum(TreeNode root, int num) {
        TreeNode left = root.left, right = root.right;
        num = num * 10 + root.val;
        if (left != null) leafNum(left, num);
        if (right != null) leafNum(right, num);
        if (left == null && right == null) sum += num;
    }
}