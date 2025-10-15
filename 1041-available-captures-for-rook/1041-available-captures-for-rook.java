class Solution {
    public int numRookCaptures(char[][] board) {
        int ans = 0;
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board[i][j] == 'R') {
                    ans += left(board, i, j);
                    ans += right(board, i, j);
                    ans += up(board, i, j);
                    ans += down(board, i, j);
                    j = 8;
                    i = 8;
                }
            }
        }
        return ans;
    }
    public int left(char[][] grid, int x, int y) {
        if(y < 0 || grid[x][y] == 'B') return 0;
        if(grid[x][y] == 'p') return 1;
        return left(grid, x, y-1);
    }
    public int right(char[][] grid, int x, int y) {
        if(y >= grid.length || grid[x][y] == 'B') return 0;
        if(grid[x][y] == 'p') return 1;
        return right(grid, x, y+1);
    }
    public int up(char[][] grid, int x, int y) {
        if(x < 0 || grid[x][y] == 'B') return 0;
        if(grid[x][y] == 'p') return 1;
        return up(grid, x-1, y);
    }
    public int down(char[][] grid, int x, int y) {
        if(x >= grid.length || grid[x][y] == 'B') return 0;
        if(grid[x][y] == 'p') return 1;
        return down(grid, x+1, y);
    }
}