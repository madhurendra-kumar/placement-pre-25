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
    public TreeNode buildTree(int[] in, int[] post) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        return helper(in,post,map,0,post.length-1);
    }
    int ind=0;
    private TreeNode helper(int[] in,int[] post,HashMap<Integer,Integer> map,int s,int e){
        if(s>e){
            return null;
        }
        int val=post[post.length-1-ind];
        ind++;
        TreeNode root=new TreeNode(val);
        if(s==e){
            return root;
        }
        int i=map.get(val);
        root.right=helper(in,post,map,i+1,e);
        root.left=helper(in,post,map,s,i-1);
        return root;
    }
}