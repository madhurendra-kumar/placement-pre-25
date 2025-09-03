class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points,(a,b)->a[0]-b[0]==0?b[1]-a[1]:a[0]-b[0]);
        int n=points.length;
        int count=0;
        for(int i=0;i<n;i++){
            int pre=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                if(points[i][1]>=points[j][1]&&pre<points[j][1]){
                    pre=points[j][1];
                    count++;
                }
            }
        }
        return count;
        
    }
}