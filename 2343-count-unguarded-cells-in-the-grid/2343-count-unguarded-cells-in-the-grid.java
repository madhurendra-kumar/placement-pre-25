class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int ans = 0 ;

       
        int[][] arr = new int[m][n];

        
        for ( int i = 0 ; i < guards.length ; i++ ) {
            int row = guards[i][0];
            int col = guards[i][1];
            arr[row][col]= 2;
        }
        
        
        for ( int i = 0 ; i < walls.length ; i++ ) {
            int row = walls[i][0];
            int col = walls[i][1];
            arr[row][col]= 3;
        }

        int[][] dirs = new int[][]{{ -1 , 0 } , { 1 , 0 } , { 0 , 1 } , { 0, -1 }};

        for ( int i = 0 ; i < m ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if( arr[i][j] == 2 ) {
                    for( int[] d : dirs ) {
                        dfs( i + d[0] , j + d[1] , d[0] , d[1] , arr );
                    }
                }
            }
        }


        
        for ( int i = 0 ; i < m ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if(arr[i][j] == 0) ans++;
            }
        }

        return ans;

    }

    public static void dfs(int row , int col , int rd , int cd , int[][] arr ) {

        if( row < 0 || col < 0 || row >= arr.length || col >= arr[0].length 
            || arr[row][col] == 3 || arr[row][col] == 2 ) return;

        arr[row][col] = 1;

        int newRow = row + rd ;
        int newCol = col + cd ;
        dfs( newRow , newCol , rd , cd , arr);

        return ;
    }

}