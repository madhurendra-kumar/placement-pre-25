class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res=0,n=points.length;
        for(int i=0;i<n-1;i++){
            res+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        return res;
        
    }
}