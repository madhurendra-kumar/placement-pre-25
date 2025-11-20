class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        bt(r,new ArrayList<>(),nums,0);
        return r ; 

    }
    private void bt(List<List<Integer>> r , List<Integer> c , int[] nums,int st){


        r.add(new ArrayList<>(c));
        for(int i = st ; i < nums.length;i++){
            c.add(nums[i]);
            bt(r,c,nums,i+1);
            c.remove(c.size() -1 );
        }
    
    
    
    }
      



}