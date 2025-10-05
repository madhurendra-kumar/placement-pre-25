class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];

        // left & right most column 
        for(int i=0; i<heights.length; i++){
            mark(i, 0, pacific, -1, -1, heights);
            mark(i, heights[0].length-1, atlantic, -1, -1, heights);
        }

        // top & bottom most row
        for(int i=0; i<heights[0].length; i++){
            mark(0, i, pacific, -1, -1, heights);
            mark(heights.length-1, i, atlantic, -1, -1, heights);
        }

        List<List <Integer>> list = new ArrayList<>();

        // cells from where rain water can flow to both the Pacific and Atlantic oceans.
        for(int i=0; i<heights.length; i++){
            for(int j=0; j<heights[0].length; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> temp = new ArrayList<>();

                    temp.add(i);
                    temp.add(j);
                    list.add(temp);
                }
            }
        }

        return list;
    }

    private void mark(int i, int j, boolean[][] arr, int oi, int oj, int[][] heights){
        if(i<0 || j<0 || i>=heights.length || j>=heights[0].length || arr[i][j] ||   
            (oi>=0 && oj>=0 && heights[oi][oj]>heights[i][j])
        ) 
            return;

        arr[i][j] = true;

        mark(i+1, j, arr, i, j, heights);
        mark(i-1, j, arr, i, j, heights);
        mark(i, j+1, arr, i, j, heights);
        mark(i, j-1, arr, i, j, heights);
    }
}