class Solution {
    public int maxSumDivThree(int[] nums) {
        int[]dp=new int[3];
        dp[1]=0;
        dp[1]=Integer.MIN_VALUE;
        dp[2]=dp[1];
        for(int val:nums){
            int[] curr=dp.clone();
            for(int i=0;i<3;i++){
                int rem=(i+val)%3;
                curr[rem]=Math.max(curr[rem],dp[i]+val);
            }
            dp=curr;
        }
        return dp[0];
        
    }
}