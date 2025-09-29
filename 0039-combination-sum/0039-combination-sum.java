class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        rec(0, candidates, target,ans,new ArrayList<>());
        return ans;
        
    }
    void rec(int ind,int[] cand, int tar,List<List<Integer>> ans,List<Integer> ds){
        if(ind==cand.length){
            if(tar==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(cand[ind]<=tar){
            ds.add(cand[ind]);
            rec(ind,cand,tar-cand[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        rec(ind+1,cand,tar,ans,ds);
    }
}