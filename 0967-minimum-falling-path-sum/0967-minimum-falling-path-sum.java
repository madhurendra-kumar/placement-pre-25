class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        Integer[][] memo = new Integer[n][n];
        int minSum = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            minSum = Math.min(minSum, helper(matrix, 0, col, memo));
        }
        return minSum;
    }

    private int helper(int[][] matrix, int row, int col, Integer[][] memo) {
        int n = matrix.length;
        if (col < 0 || col >= n) return Integer.MAX_VALUE;
        if (row == n - 1) return matrix[row][col];
        if (memo[row][col] != null) return memo[row][col];

        int path1 = helper(matrix, row + 1, col - 1, memo);
        int path2 = helper(matrix, row + 1, col, memo);
        int path3 = helper(matrix, row + 1, col + 1, memo);

        memo[row][col] = matrix[row][col] + Math.min(path2, Math.min(path1, path3));
        return memo[row][col];
    }
}
