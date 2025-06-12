class Solution {
    static int idx;

    public TreeNode bstFromPreorder(int[] preorder) {
        idx = 0;
        return build(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int min, int max) {
        if (idx >= preorder.length){
            return null;
        }

        int val = preorder[idx];
        if (val < min || val > max){
            return null;
        }

        TreeNode node = new TreeNode(val);
        idx++;
        node.left = build(preorder, min, val);
        node.right = build(preorder, val, max);

        return node;
    }
}
