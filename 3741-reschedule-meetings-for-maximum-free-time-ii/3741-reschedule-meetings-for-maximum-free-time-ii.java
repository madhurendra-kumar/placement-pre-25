class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n=startTime.length;
        int[] gaps=new int[n+1];
        gaps[0]=startTime[0];
        for(int i=1;i<n;i++){
            gaps[i]=startTime[i]-endTime[i-1];
        }
        gaps[n]=eventTime-endTime[n-1];
        int[] left=new int[n+1];
        int[] right=new int[n+1];
        for(int i=1;i<=n;i++){
            left[i]=Math.max(left[i-1],gaps[i-1]);
        }
        for(int i=n-1;i>=0;i--){
            right[i]=Math.max(right[i+1],gaps[i+1]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int dur=endTime[i]-startTime[i];
            if(left[i]>=dur || right[i+1]>=dur){
                ans=Math.max(ans,gaps[i]+gaps[i+1]+dur);
                System.out.println(ans);
            }
            ans=Math.max(ans,gaps[i]+gaps[i+1]);
        }
        return ans;
    }
}