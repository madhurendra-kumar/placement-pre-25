class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {

        for (int i = 1; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (j - 1 < 0) {
                    continue;
                } else if (matrix[i][j] != matrix[i - 1][j - 1]){
                    return false;
                }
            }
        }

        return true;
    }
}