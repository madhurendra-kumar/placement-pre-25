class Solution {
    public double soupServings(int n) {
         if(n>=4800) return 1;
       double dp[][]=new double[n+1][n+1];
       for(int i=0;i<=n;i++)
       Arrays.fill(dp[i],-1);
        return solve(n , n ,dp);
    }

    public double solve(int a, int b,double dp[][]) {
        if (a == 0 && b == 0) return 0.5;
        if (a != 0 && b==0) return 0;
        if (a==0 && b != 0) return 1;
        if(dp[a][b]!=-1)
        return dp[a][b];
        double case1=0,case2=0,case3=0,case4=0;

        case1 = 0.25 * solve( Math.max(a-100, 0), b,dp);
         case2 = 0.25 * solve( Math.max(a-75,0), Math.max(b-25,0),dp);
         case3 = 0.25 * solve(Math.max(a-50,0), Math.max(b-50,0),dp);
         case4 = 0.25 * solve(Math.max(a-25,0),  Math.max(b-75,0),dp);
        
        return dp[a][b]=case1 + case2 + case3 + case4; }
}