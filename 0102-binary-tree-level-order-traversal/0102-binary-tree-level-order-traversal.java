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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        level(sol,list,root);
        return sol;
    }
    public void level(List<List<Integer>> sol, List<Integer> list,TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);


        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                sol.add(list);
                list = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
}