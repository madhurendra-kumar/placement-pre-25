class Solution {
    public int findShortestSubArray(int[] nums) {
        int maxElement=0;
        for(int num: nums){
            maxElement=Math.max(maxElement, num);
        }
        int[] count=new int[maxElement+1];
        int[] firstOccurrence=new int[maxElement+1];
        int[] lastOccurrence=new int[maxElement+1];
        int degree=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            count[num]++;
            degree=Math.max(degree, count[num]);
            if(count[num]==1){
                firstOccurrence[num]=i;
            }
            lastOccurrence[num]=i;
        }
        int minLength=nums.length;
        for(int i=0;i<=maxElement;i++){
            if(count[i]==degree){
                minLength=Math.min(minLength, lastOccurrence[i]-firstOccurrence[i]+1);
            }
        }
        return minLength;
        
    }
}