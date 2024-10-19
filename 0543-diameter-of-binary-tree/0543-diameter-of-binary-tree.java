class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int l1=getLength(root.left);
        int l2=getLength(root.right);
        max=Math.max(max,l1+l2);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return max;
    }
    private int getLength(TreeNode root){
        if(root==null) return 0;
        int l1=getLength(root.left);
        int l2=getLength(root.right);
        return 1+Math.max(l1,l2);
    }
}