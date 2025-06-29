import java.util.*;

class Solution {
    int idx = 0;
    Map<Integer, Integer> map = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int left, int right) {
        if (left > right) return null;

        int val = preorder[idx++];
        TreeNode root = new TreeNode(val);

        int mid = map.get(val);
        root.left = build(preorder, left, mid - 1);
        root.right = build(preorder, mid + 1, right);

        return root;
    }
}
