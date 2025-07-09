class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n=startTime.length;
        List<Integer> gaps=new ArrayList<>();
        gaps.add(startTime[0]);
        for(int i=1;i<n;i++){
            gaps.add(startTime[i]- endTime[i-1]);
        }
        gaps.add(eventTime-endTime[n-1]);
        int currentSum=0,res=0;
        for(int i=0;i<gaps.size();i++){
            currentSum+=gaps.get(i)-((i>=k+1)? gaps.get(i-(k+1)):0);
            res=Math.max(res,currentSum);
        }
        return res;
        
    }
}