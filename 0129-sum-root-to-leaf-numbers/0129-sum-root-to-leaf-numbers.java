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
    void dfs(TreeNode root,String path,List<String> ans)
    {
        if(root==null) return;
        path+=root.val;
        if(root.left==null && root.right==null) {
            ans.add(path);
            return;
        }
        dfs(root.left,path,ans);
        dfs(root.right,path,ans);
    }
    public int sumNumbers(TreeNode root) {
        List<String> ans= new ArrayList<>();
        dfs(root,"",ans);
        int sum=0;
        for (String num : ans) {
    sum += Integer.parseInt(num);
}
    return sum;
}
}