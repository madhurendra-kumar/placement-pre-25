class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow=m;
        int minCol=n;
        for(int[] arr: ops){
            minRow=Math.min(minRow, arr[0]);
            minCol=Math.min(minCol, arr[1]);
        }
        return minCol*minRow;
        
    }
}