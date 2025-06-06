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
    static class Info {
        int dia;
        int ht;
        Info(int dia,int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public Info diameter(TreeNode root){
        if(root==null){
            return new Info(0,0);
        }
        Info l = diameter(root.left);
        Info r = diameter(root.right);

        int d = Math.max(l.dia,Math.max(r.dia,l.ht + r.ht + 1));
        int h = Math.max(l.ht,r.ht)+1;
        return new Info(d,h);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia - 1;
    }
}