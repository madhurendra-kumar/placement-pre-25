class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=Integer.MIN_VALUE;
        int l=0;
        int r=0;
        while(r<nums.length){
            while((long)k*nums[l]<nums[r]){
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return nums.length-ans;
    }
}