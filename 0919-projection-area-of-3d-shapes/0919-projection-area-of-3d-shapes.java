class Solution {
    public int projectionArea(int[][] grid) {
        int top=0, front=0;
        for(int r=0;r<grid.length;r++){
            front+=Arrays.stream(grid[r]).max().getAsInt();
        }
        int[] rows=new int[grid.length];
        int[] cols=new int[grid[0].length];
        for(int c=0;c<grid[0].length;c++){
            for(int r=0;r<grid.length;r++){
                top+=grid[r][c]>0?1:0;
                cols[c]=cols[c]<grid[r][c]? grid[r][c]: cols[c];
            }
        }
        return top + front+ Arrays.stream(cols).sum();
        
    }
}