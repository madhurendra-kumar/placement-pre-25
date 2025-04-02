class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        if(n<3) return 0;
        long max=0;
        long a=Long.MIN_VALUE;
        int b=nums[0];

        for(int i=1;i<n-1; i++){
            a=Math.max(a,b-nums[i]);
            max=Math.max(max,a*nums[i+1]);
            b=Math.max(b,nums[i]);
        }
        return max;
        
    }
}