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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root==null) return null;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0)
        {
            int levelSize= q.size();
            double levelSum=0.0;
            for(int i=0;i<levelSize;i++)
            {
                TreeNode front = q.remove();
                levelSum+=front.val;
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            ans.add(levelSum/levelSize);
        }
        return ans;
    }
}