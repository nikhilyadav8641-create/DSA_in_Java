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
    static void preorder(TreeNode root, ArrayList<TreeNode> arr) {
        if (root == null)
            return;
        arr.add(root);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode> arr= new ArrayList<>();
        preorder(root,arr);
        for(int i=0;i<arr.size()-1;i++)
        {
            TreeNode a= arr.get(i); 
            TreeNode b= arr.get(i+1);
            a.right=b;
            a.left=null; 
        }
        TreeNode last= arr.get(arr.size()-1);
        last.left=null;
        last.right=null;
    }
}