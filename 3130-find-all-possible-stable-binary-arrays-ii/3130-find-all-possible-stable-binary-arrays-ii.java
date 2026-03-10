
class Solution {
    static final int mod = 1000000007;
    int[][][] memo;
    int limit;
    public int numberOfStableArrays(int zero, int one, int limit) {
        this.memo = new int[zero+1][one+1][2];
        this.limit = limit;
        for(int i=0;i<=zero;i++){
            for(int j=0;j<=one;j++){
                Arrays.fill(memo[i][j],-1);
            }
        }
        return (dp(zero,one,0)+dp(zero,one,1))%mod;
    }
    public int dp(int zero,int one,int lastBit){
        if(zero == 0){
            return (lastBit == 0 || one>limit) ? 0 : 1;
        }
        else if(one == 0){
            return (lastBit == 1 || zero>limit) ? 0 : 1;
        }
        if(memo[zero][one][lastBit] == -1){
            int res = 1;
            if(lastBit == 0){
                res = (dp(zero-1,one,0)+dp(zero-1,one,1))%mod;
                if(zero>limit){
                    res = (res-dp(zero-limit-1,one,1)+mod)%mod;
                }
            }
            else{
                res = (dp(zero,one-1,0)+dp(zero,one-1,1))%mod;
                if(one>limit){
                    res = (res-dp(zero,one-limit-1,0)+mod)%mod;
                }
            }
            memo[zero][one][lastBit] = res%mod;
        }
        return memo[zero][one][lastBit];
    }
}