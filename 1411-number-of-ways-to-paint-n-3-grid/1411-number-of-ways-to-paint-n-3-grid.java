class Solution {
    int mod = 1000000007;
    Long[][] dp;
    public int numOfWays(int n) {
        dp = new Long[n+1][2];
        long ans = (helper(n,0)+helper(n,1))%mod;
        return (int)ans;
    }
    private long helper(int r,int type){
        if(r==1)return 6;
        if(dp[r][type]!=null) return dp[r][type];
        if(type==0){
            dp[r][type] = ((2*helper(r-1,0))%mod+(2*helper(r-1,1))%mod)%mod;
        }else{
            dp[r][type] = ((2*helper(r-1,0))%mod+(3*helper(r-1,1))%mod)%mod;
        }
        return dp[r][type];
    }
}