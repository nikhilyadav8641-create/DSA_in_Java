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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null)
        return ans;
        q.add(root);
        while(q.size()>0)
        {
            int levelSize=q.size();
            List<Integer> res= new ArrayList<>();
            for(int i=0;i<levelSize;i++){
            TreeNode front= q.remove();
            int x=front.val;
            res.add(x);
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
            }
            ans.add(0,res);
        }
        return ans;
    }
}