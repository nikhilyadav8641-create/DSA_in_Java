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
    void attach(TreeNode root,int key)
    {
        if(root==null) return;
        if(root.val==key) return;
        if(root.val<key) 
        {
            if(root.right==null) root.right= new TreeNode(key);
            else attach(root.right,key);
        }
        else
        {
            if(root.left==null) root.left= new TreeNode(key);
            else attach(root.left,key);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        attach(root,val);
        return root;
    }
}