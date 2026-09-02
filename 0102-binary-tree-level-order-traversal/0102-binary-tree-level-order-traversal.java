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
    class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level)
        {
            this.node= node;
            this.level=level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair front= q.remove();
            int level=front.level;
            if(ans.size()==level)
            {
                ans.add(new ArrayList<>());
            }
            ans.get(level).add(front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left,level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,level+1));
        }
        return ans;
    }
}
// class Solution {

//     class Pair {
//         TreeNode node;
//         int level;

//         Pair(TreeNode node, int level) {
//             this.node = node;
//             this.level = level;
//         }
//     }

//     public List<List<Integer>> levelOrder(TreeNode root) {

//         List<List<Integer>> ans = new ArrayList<>();

//         if (root == null) {
//             return ans;
//         }

//         Queue<Pair> q = new LinkedList<>();

//         q.add(new Pair(root, 0));

//         while (!q.isEmpty()) {

//             Pair front = q.remove();

//             int level = front.level;

//             // Create a new list only for a new level
//             if (ans.size() == level) {
//                 ans.add(new ArrayList<>());
//             }

//             // Add the value to the correct level
//             ans.get(level).add(front.node.val);

//             // Add left child
//             if (front.node.left != null) {
//                 q.add(new Pair(front.node.left, level + 1));
//             }

//             // Add right child
//             if (front.node.right != null) {
//                 q.add(new Pair(front.node.right, level + 1));
//             }
//         }

//         return ans;
//     }
// }
