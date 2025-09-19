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
    List<Integer> list=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inorder(root, list);
        TreeNode dummy=new TreeNode(1);
        TreeNode temp=dummy;
        int index=0;
        while (index<list.size()){
            temp.right=new TreeNode(list.get(index++));
            temp=temp.right;
        }
        return dummy.right;
        
    }
    public static void inorder(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}