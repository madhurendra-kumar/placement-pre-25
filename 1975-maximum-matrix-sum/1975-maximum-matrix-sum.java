class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0;
        int negs = 0;
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                if (val < 0) negs++;
                ans += Math.abs(val);
                minAbs = Math.min(minAbs, Math.abs(val));
            }
        }
        if (negs % 2 == 0) return ans;
        return ans - 2 * minAbs;
    }
}