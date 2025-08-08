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
    public int findSecondMinimumValue(TreeNode root) {
        return secondMinimum(root, root.val);
        
    }
    public int secondMinimum(TreeNode root, int minValue){
        if(root==null) return -1;
        if(root.val>minValue) return root.val;
        int left=secondMinimum(root.left, minValue);
        int right=secondMinimum(root.right, minValue);
        if(left!=-1 && right!=-1) return Math.min(left,right);
        return left!=-1? left:right;
    }
}