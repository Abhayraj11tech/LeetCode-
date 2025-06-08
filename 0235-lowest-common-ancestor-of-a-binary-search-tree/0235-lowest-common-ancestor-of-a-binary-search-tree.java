/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public static boolean getPath(TreeNode root,TreeNode p, ArrayList<TreeNode> arr){
        if(root==null){
            return false;
        }
        arr.add(root);

        if(root == p){
            return true;
        }
        if(getPath(root.left,p,arr)){
            return true;
        }
        if(getPath(root.right,p,arr)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        getPath(root,p,path1);
        getPath(root,q,path2);

        int i = 0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
    }
}