class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]<nums[j]) {
                max=Math.max((nums[j]-nums[i]), max);
            } else {
                i=j;
            }
        }
        if(max==0){
            return -1;
        }
        return max;
        
    }
}