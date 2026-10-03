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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n= inorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }
    public TreeNode build(int inlow,int inhigh,int postlow,int posthigh,int[] inorder, int[] postorder)
    {
        if(inlow>inhigh || postlow>posthigh) return null;
        int val=postorder[posthigh];
        TreeNode root= new TreeNode(val);
        int r=-1;
        for(int i=inlow;i<=inhigh;i++)
        {
            if(inorder[i]==val)
            {
                r=i;
                break;
            }
        }
        int cnt =r-inlow;
        root.left=build(inlow,r-1,postlow,postlow+cnt-1,inorder,postorder);
        root.right=build(r+1,inhigh,postlow+cnt,posthigh-1,inorder,postorder);
        return root;
    }
}