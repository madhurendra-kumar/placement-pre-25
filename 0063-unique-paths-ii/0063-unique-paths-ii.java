class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int dp[][]= new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=-1;
            }
        }
        return count(obstacleGrid,dp,m-1,n-1);
    }
    public int count(int obstacle[][],int dp[][], int m, int n) {

        if(m < 0 || n < 0) return 0;
        if(m == 0 && n == 0)
        {
             if(obstacle[m][n]==1)
            {
            return 0;
            }
            else
            {
                return 1;
            }
        }
         

        if(dp[m][n] != -1) return dp[m][n];
        if(obstacle[m][n]==1)
        {
            return 0;
        }
        int up = count(obstacle,dp, m - 1, n);
        int left = count(obstacle,dp, m, n - 1);

        dp[m][n] = up + left;

        return dp[m][n];
    }
}