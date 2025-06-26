/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static ArrayList<Integer> arr;
    public boolean findTarget(TreeNode root, int k) {
        arr = new ArrayList<>();
        inOrder(root);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i!=j && (arr.get(i)+arr.get(j)==k)){
                    return true;
                }
            }
        }
        return false;

    }
    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        arr.add(root.val);
        inOrder(root.right);
    }
}