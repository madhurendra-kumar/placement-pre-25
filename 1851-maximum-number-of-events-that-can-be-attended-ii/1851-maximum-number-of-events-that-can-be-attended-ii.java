class Solution {
    public int maxValue(int[][] events, int k) {
        // Sort events by end day
        Arrays.sort(events, (a, b) -> a[1] - b[1]);

        // Extract start days for binary search
        int n = events.length;
        int[] endDays = new int[n];
        for (int i = 0; i < n; i++) {
            endDays[i] = events[i][1];
        }

        // DP table: dp[i][j] = max value using first i events and attending j
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            int[] curr = events[i - 1];
            int start = curr[0], end = curr[1], val = curr[2];

            // Binary search to find the last event that ends before current start
            int prevIdx = binarySearch(events, start);

            for (int j = 1; j <= k; j++) {
                // Option 1: don't take this event
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);

                // Option 2: take this event
                dp[i][j] = Math.max(dp[i][j], dp[prevIdx + 1][j - 1] + val);
            }
        }

        return dp[n][k];
    }

    // Finds the index of the last event that ends before 'start'
    private int binarySearch(int[][] events, int start) {
        int low = 0, high = events.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (events[mid][1] < start) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }
}