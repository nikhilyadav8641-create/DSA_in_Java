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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        boolean flag= true;
        while(q.size()>0)
        {
            int n=q.size();
            List<Integer> res= new ArrayList<>();
            while(n!=0)
            {
                TreeNode front= q.remove();
                res.add(front.val);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
                n--;
            }
            if(!flag)
            {
                Collections.reverse(res);
            }
            ans.add(res);
            flag=!flag;
        }
        return ans;
    }
}
