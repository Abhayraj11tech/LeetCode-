import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findMode(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (TreeNode node : arr) {
            frequencyMap.put(node.val, frequencyMap.getOrDefault(node.val, 0) + 1);
        }

        int sol = 0;
        for (int freq : frequencyMap.values()) {
            sol = Math.max(sol, freq);
        }

        ArrayList<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == sol) {
                modes.add(entry.getKey());
            }
        }

        return modes.stream().mapToInt(i -> i).toArray();
    }

    private static void inorderTraversal(TreeNode node, ArrayList<TreeNode> arr) {
        if (node == null) return;
        inorderTraversal(node.left, arr);
        arr.add(node);
        inorderTraversal(node.right, arr);
    }
}
