class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int val:nums)sum+=val;
        int count=0,leftSum=0;
        for(int i= 0;i<nums.length-1;i++){
            leftSum+=nums[i];
            sum-=nums[i];
            if((sum&1)==(leftSum&1)) count++;
        }
        return count;
        
    }
}