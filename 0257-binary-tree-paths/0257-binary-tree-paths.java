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
    void dfs(TreeNode root,String path, List<String> ans)
    {
        if(root==null ) return;
        path=path+root.val;
        if(root.left==null && root.right==null)
        {
            ans.add(path);
            return;
        }
        path=path+"->";
        dfs(root.left,path,ans);
        dfs(root.right,path,ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
         List<String> ans = new ArrayList<>();
         dfs(root,"",ans);
         return ans;
    }
}