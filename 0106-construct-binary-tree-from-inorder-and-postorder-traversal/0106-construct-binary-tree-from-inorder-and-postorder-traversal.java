import java.util.*;

class Solution {
    int idx;
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(postorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] postorder, int left, int right) {
        if (left > right) 
        {
            return null;
        }

        int val = postorder[idx--];
        TreeNode root = new TreeNode(val);

        int mid = map.get(val);
        root.right = build(postorder, mid + 1, right);
        root.left = build(postorder, left, mid - 1);

        return root;
    }
}
