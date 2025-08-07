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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Integer> count=new ArrayList<>();
        List<Double> sum=new ArrayList<>();
        TreeNode temp=root;
        find(temp,count,sum,0);
        List<Double> list=new ArrayList<>();
        for(int i=0;i<count.size();i++){
            double val=sum.get(i)/count.get(i);
            list.add(val);
        }
        return list;
        
    }
    public void find(TreeNode root, List<Integer> count, List<Double> sum,int dep){
        if(root==null){
            return;
        }
        if(count.size()==dep){
            count.add(1);
            double valu=root.val;
            sum.add(valu);
        }
        else{
            int new_count=count.get(dep)+1;
            double new_sum=sum.get(dep)+ (double)(root.val);
            count.remove(dep);
            sum.remove(dep);
            count.add(dep,new_count);
            sum.add(dep,new_sum);
        }
        find(root.left, count,sum,dep+1);
        find(root.right,count,sum,dep+1);
    }
}