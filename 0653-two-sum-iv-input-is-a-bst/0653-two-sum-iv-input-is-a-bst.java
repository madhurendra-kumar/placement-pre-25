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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen=new HashSet<>();
        return inorderTraversal(root,k,seen);
    }
    private boolean inorderTraversal(TreeNode node, int k, Set<Integer> seen){
        if(node==null){
            return false;
        }
        if(seen.contains(k-node.val)){
            return true;
        }
        seen.add(node.val);
        return inorderTraversal(node.left,k,seen)||inorderTraversal(node.right,k,seen);
    }
}