class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int cur_or=0;
        int max_or=0;
        for(int e:nums){
            max_or |=e;
        }
        return countSubSet(0,nums,cur_or,max_or);
        
    }
    public int countSubSet(int idx,int[] nums,int cur_or,int max_or){
        if(idx==nums.length){
            return cur_or==max_or?1:0;
        }
        int taken=countSubSet(idx+1,nums,cur_or|nums[idx],max_or);
        int nottaken=countSubSet(idx+1,nums,cur_or,max_or);
        return taken+nottaken;
    }
}