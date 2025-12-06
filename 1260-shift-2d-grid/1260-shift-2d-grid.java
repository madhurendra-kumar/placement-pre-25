class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        
        k = k % total;
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < total; i++) {
            
            int index = (total - k + i) % total;
            
            list.get(i/n).add(grid[index/n][index%n]);
            
        }
        return list;
    }
}