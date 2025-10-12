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
    TreeNode par = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        int res = check(root,x,y,1);

        if( res != 0)
            return false;
        else if( res == 0 && par.left!= null && par.left.val == x || par.left.val == y && par.right != null && par.right.val == x || par.right.val == y )
            return false;
        else 
            return true;

    }

    public int check(TreeNode root, int x, int y, int level)
    {
        if(root == null)
            return -1;
        
        if(root.val == x || root.val == y)
            return level;

        int left = check(root.left,x,y,level+1);
        int right = check(root.right,x,y,level+1);

        if(left >=0 && right >=0)
        {
            par = root;
            return Math.min(left,right)-Math.max(left,right);
        }
        if( left >= 0)
            return left;

        return right;     
    }
}