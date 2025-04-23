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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> res = new ArrayList<>();
        InOrder(root, res);
        return res;
    }
    private void InOrder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        InOrder(root.left, ans);
        ans.add(root.val);
        InOrder(root.right, ans);
    }
}    
    
