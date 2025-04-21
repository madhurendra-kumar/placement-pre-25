class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][]memo=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                memo[i][j] = -1;
            }
        }
        return helper(triangle,memo, 0, 0);
}

private int helper(List<List<Integer>> triangle,int[][] memo, int row, int col) {
    if (row ==triangle.size() )
    return 0;
    if(memo[row][col]!= -1) return memo[row][col];
       
    int left = helper(triangle,memo, row + 1, col);
    int right = helper(triangle,memo, row + 1, col + 1);
    memo[row][col] = triangle.get(row).get(col) + Math.min(left, right);
    return memo[row][col];
}
    }
