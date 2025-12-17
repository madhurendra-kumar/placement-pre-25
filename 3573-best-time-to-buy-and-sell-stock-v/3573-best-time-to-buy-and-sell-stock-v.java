class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        long[][][] dp = new long[n][k + 1][3];

        
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= k; j++)
                for (int h = 0; h < 3; h++)
                    dp[i][j][h] = Long.MIN_VALUE / 2;

        
        for (int t = 0; t <= k; t++) {
            dp[0][t][0] = 0;
            if (t > 0) {
                dp[0][t][1] = -prices[0];  
                dp[0][t][2] = prices[0];   
            }
        }

        for (int i = 1; i < n; i++) {
            for (int t = 0; t <= k; t++) {
                
                dp[i][t][0] = dp[i - 1][t][0];
                if (t <= k)
                    dp[i][t][0] = Math.max(dp[i][t][0], Math.max(
                        dp[i - 1][t][1] + prices[i], 
                        dp[i - 1][t][2] - prices[i]  
                    ));

                
                if (t > 0)
                    dp[i][t][1] = Math.max(dp[i - 1][t][1], dp[i - 1][t - 1][0] - prices[i]);

                
                if (t > 0)
                    dp[i][t][2] = Math.max(dp[i - 1][t][2], dp[i - 1][t - 1][0] + prices[i]);
            }
        }

        long maxProfit = 1;
        for (int t = 0; t <= k; t++) {
            maxProfit = Math.max(maxProfit, dp[n - 1][t][0]);
        }

        return maxProfit;
    }
}