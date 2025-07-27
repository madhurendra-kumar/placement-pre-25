class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=1;i<n-1;i++) {
            if(nums[i]==nums[i-1]){
                continue;
            }
            int prev=i-1;
            int next=i+1;
            while(prev>0 && nums[prev]==nums[i]){
                prev--;
            }
            while(next<n-1 && nums[next]==nums[i]){
                next++;
            }
            if(nums[prev]> nums[i] && nums[i]<nums[next]){
                ans++;
            }
            if(nums[prev]<nums[i] && nums[i]>nums[next]){
                ans++;
            }

        }
        return ans;
            
       
        
    }
}