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
    void inorder(TreeNode root , ArrayList<Integer> ans)
    {
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> ans= new ArrayList<>();
        inorder(root,ans);
        for(int i=0;i<ans.size()-1;i++)
        {
            if(ans.get(i)>=ans.get(i+1))
            return false;
        }
        return true;
    }
}