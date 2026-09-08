/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root==null) return null;
//         if(root.val==p.val|| root.val==q.val) return root;
//         boolean pLiesInLeft= exists(root.left,p.val);
//         boolean qLiesInRight= exists(root.right,q.val);
//         if(pLiesInLeft && !qLiesInRight) return lowestCommonAncestor(root.left,p,q);
//         else if(!pLiesInLeft && qLiesInRight) return lowestCommonAncestor(root.right,p,q);
//         else return root;
//     }
//     public boolean exists(TreeNode root,int val)
//     {
//         if(root==null) return false;
//         if(root.val==val) return true;
//         return exists(root.left,val) || exists(root.right,val);
//     }
// }
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null) return null;
        
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        boolean pLiesInLeft = exists(root.left, p.val);
        boolean qLiesInLeft = exists(root.left, q.val);

        // Both nodes are in the left subtree
        if (pLiesInLeft && qLiesInLeft) {
            return lowestCommonAncestor(root.left, p, q);
        }

        // Both nodes are in the right subtree
        else if (!pLiesInLeft && !qLiesInLeft) {
            return lowestCommonAncestor(root.right, p, q);
        }

        // One node is on the left and the other is on the right
        else {
            return root;
        }
    }

    public boolean exists(TreeNode root, int val) {
        if (root == null) return false;

        if (root.val == val) return true;

        return exists(root.left, val) || exists(root.right, val);
    }
}