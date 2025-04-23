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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> node=new ArrayList<>();
        preorder(root,node);
        return node;
        
    }
    private void preorder(TreeNode root, List<Integer> node){
        if(root==null){
            return;
        }
        node.add(root.val);
        preorder(root.left,node);
        preorder(root.right,node);
    }
}