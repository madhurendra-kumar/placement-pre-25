class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        int size = matrix.length * matrix[0].length;
        int count = 1;

        while ( count <= size ) {
            // left to right 
            for( int i = left; i <= right &&  count <= size ; i++ ){
                matrix[top][i] = count++;
                
            }
            top ++;
            // top to bottom 
            for( int i = top ; i <= bottom &&  count <= size ; i++ ){
                 matrix[i][right] = count++ ;
              
            }
            right --;
            // right to left 
            for( int i = right   ; i >= left && count <= size; i--  ){
                matrix[bottom][i] = count++;
                
            }
            bottom --;
            // bottom to top 
            for( int i = bottom  ; i >= top &&  count <= size; i-- ){
                matrix[i][left] = count++;
            
            }
            left++;
        }
        return matrix;

    }
}